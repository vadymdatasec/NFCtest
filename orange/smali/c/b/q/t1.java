public class c.b.q.t1 implements c.b.q.w1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public c.b.q.t1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.graphics.drawable.Drawable a ( android.content.Context p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources$Theme p3 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 try { // :try_start_0
			 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
			 c.b.m.a.h .e ( p1,v0,p2,p3,p4 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p1 */
			 final String p2 = "AsldcInflateDelegate"; // const-string p2, "AsldcInflateDelegate"
			 final String p3 = "Exception while inflating <animated-selector>"; // const-string p3, "Exception while inflating <animated-selector>"
			 /* .line 2 */
			 android.util.Log .e ( p2,p3,p1 );
			 int p1 = 0; // const/4 p1, 0x0
		 } // .end method
