public class com.orange.hce.proto.activity.PermissionsActivity$a extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/orange/hce/proto/activity/PermissionsActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final com.orange.hce.proto.activity.PermissionsActivity a; //synthetic
/* # direct methods */
public com.orange.hce.proto.activity.PermissionsActivity$a ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 0 */
/* .line 1 */
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String p2 = "android.bluetooth.adapter.action.STATE_CHANGED"; // const-string p2, "android.bluetooth.adapter.action.STATE_CHANGED"
/* .line 2 */
p1 = (( java.lang.String ) p2 ).equals ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
	 /* .line 3 */
	 p1 = this.a;
	 com.orange.hce.proto.activity.PermissionsActivity .a ( p1 );
	 p2 = 	 (( androidx.viewpager.widget.ViewPager ) p2 ).getCurrentItem ( ); // invoke-virtual {p2}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I
	 (( com.orange.hce.proto.activity.PermissionsActivity ) p1 ).h ( p2 ); // invoke-virtual {p1, p2}, Lcom/orange/hce/proto/activity/PermissionsActivity;->h(I)V
	 /* .line 4 */
	 p1 = this.a;
	 p1 = 	 com.orange.hce.proto.activity.PermissionsActivity .b ( p1 );
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 5 */
		 p1 = this.a;
		 (( com.orange.hce.proto.activity.PermissionsActivity ) p1 ).z ( ); // invoke-virtual {p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V
		 /* .line 6 */
	 } // :cond_0
	 p1 = this.a;
	 int p2 = 0; // const/4 p2, 0x0
	 com.orange.hce.proto.activity.PermissionsActivity .a ( p1,p2 );
} // :cond_1
return;
} // .end method
