public class com.orange.hce.proto.widget.PackIdWidgetService extends android.widget.RemoteViewsService {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/orange/hce/proto/widget/PackIdWidgetService$b; */
	 /* } */
} // .end annotation
/* # direct methods */
public com.orange.hce.proto.widget.PackIdWidgetService ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Landroid/widget/RemoteViewsService;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public android.widget.RemoteViewsService$RemoteViewsFactory onGetViewFactory ( android.content.Intent p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance p1, Lcom/orange/hce/proto/widget/PackIdWidgetService$b; */
	 (( android.widget.RemoteViewsService ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/widget/RemoteViewsService;->getApplicationContext()Landroid/content/Context;
	 /* invoke-direct {p1, v0}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;-><init>(Landroid/content/Context;)V */
} // .end method
