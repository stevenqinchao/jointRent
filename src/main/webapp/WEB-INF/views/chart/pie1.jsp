<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script src="resources/js/extjs/ext-all.js"></script>
<link rel="stylesheet" href="resources/js/extjs/resources/css/ext-all.css">

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<script>
    Ext.Loader.setConfig({
        enabled : true
    });
    Ext.require('Ext.chart.*');
    Ext.require([ 'Ext.layout.container.Fit', 'Ext.window.MessageBox', 'Ext.grid.*', 'Ext.util.*' ]);

    Ext.onReady(function() {

        //effort
        var store = Ext.create('Ext.data.JsonStore', {
            fields : [ 'id', 'name', 'data1' ],
            proxy : {
                type : 'ajax',
                url : 'pieData',
                reader : {
                    type : 'json'
                }
            }
        });
        store.load({
            callback : function(records, operation, success) {
            }
        });

        var donut = false, chart = Ext.create('Ext.chart.Chart', {
            xtype : 'chart',
            animate : true,
            store : store,
            shadow : true,
            legend : {
                position : 'right'
            },
            insetPadding : 60,
            theme : 'Base:gradients',
            series : [ {
                type : 'pie',
                field : 'data1',
                showInLegend : true,
                donut : donut,
                tips : {
                    trackMouse : true,
                    width : 140,
                    height : 28,
                    renderer : function(storeItem, item) {
                        //calculate percentage.
                        var total = 0;
                        store.each(function(rec) {
                            total += rec.get('data1');
                        });
                        this.setTitle(storeItem.get('name') + ': ' + Math.round(storeItem.get('data1') / total * 100)
                                + '%');
                    }
                },
                highlight : {
                    segment : {
                        margin : 20
                    }
                },
                label : {
                    field : 'name',
                    display : 'rotate',
                    contrast : true,
                    font : '18px Arial'
                }
            } ]
        });

        Ext.create('widget.panel', {
            width : 800,
            height : 600,
            title : "<spring:message code='title' arguments='pie'/>",
            renderTo : "chart",
            layout : 'fit',
            tbar : [
                    {
                        text : 'Save Chart',
                        handler : function() {
                            Ext.MessageBox.confirm('Confirm Download', "<spring:message code='check_download' />",
                            	function(choice) {
                                        if (choice == 'yes') {
                                            chart.save({
                                                type : 'image/png'
                                            });
                                        }
                                    });
                        }
                    }, {
                        text : 'Reload Data',
                        handler : function() {
                            // Add a short delay to prevent fast sequential clicks
                            window.loadTask.delay(100, function() {
                                store1.loadData(generateData(6, 20));
                            });
                        }
                    }, {
                        enableToggle : true,
                        pressed : false,
                        text : 'Donut',
                        toggleHandler : function(btn, pressed) {
                            chart.series.first().donut = pressed ? 35 : false;
                            chart.refresh();
                        }
                    } ],
            items : chart
        });

    });
</script>



<body>
    <div id="chart"></div>
    
    <div id="inputtest">
        <input type="text" class="<spring:message code='TITLE_VALIDATOR' />">
    </div>
</body>
</html>



