public abstract class e.h.b.a.q.d {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static a ( android.content.Context p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 android.appwidget.AppWidgetManager .getInstance ( v0 );
		 /* .line 2 */
		 /* new-instance v1, Landroid/content/ComponentName; */
		 /* const-class v2, Lcom/orange/hce/proto/widget/PackIdWidgetProvider; */
		 /* invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
		 (( android.appwidget.AppWidgetManager ) v0 ).getAppWidgetIds ( v1 ); // invoke-virtual {v0, v1}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I
	 } // .end method
	 public static Boolean b ( android.content.Context p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 android.appwidget.AppWidgetManager .getInstance ( v0 );
		 int v1 = 0; // const/4 v1, 0x0
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 /* new-instance v2, Landroid/content/ComponentName; */
	 /* const-class v3, Lcom/orange/hce/proto/widget/PackIdWidgetProvider; */
	 /* invoke-direct {v2, p0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
	 (( android.appwidget.AppWidgetManager ) v0 ).getAppWidgetIds ( v2 ); // invoke-virtual {v0, v2}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I
	 /* array-length p0, p0 */
	 /* if-lez p0, :cond_1 */
	 int v1 = 1; // const/4 v1, 0x1
} // :cond_1
} // .end method
public static void c ( android.content.Context p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = e.h.b.a.q.d .b ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 final String v0 = "PackidWidgetUpdater"; // const-string v0, "PackidWidgetUpdater"
	 final String v1 = "request to update packid widgets"; // const-string v1, "request to update packid widgets"
	 /* .line 2 */
	 android.util.Log .d ( v0,v1 );
	 /* .line 3 */
	 /* new-instance v0, Landroid/content/Intent; */
	 int v1 = 0; // const/4 v1, 0x0
	 (( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
	 /* const-class v3, Lcom/orange/hce/proto/widget/PackIdWidgetProvider; */
	 final String v4 = "android.appwidget.action.APPWIDGET_UPDATE"; // const-string v4, "android.appwidget.action.APPWIDGET_UPDATE"
	 /* invoke-direct {v0, v4, v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V */
	 /* .line 4 */
	 e.h.b.a.q.d .a ( p0 );
	 final String v2 = "appWidgetIds"; // const-string v2, "appWidgetIds"
	 (( android.content.Intent ) v0 ).putExtra ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;
	 /* .line 5 */
	 (( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
	 (( android.content.Context ) p0 ).sendBroadcast ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
} // :cond_0
return;
} // .end method
