public class com.orange.hce.proto.activity.AccessBadgeDetailActivity extends e.h.b.a.l.d1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.orange.hce.proto.activity.AccessBadgeDetailActivity ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/b/a/l/d1;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.View a ( android.view.LayoutInflater p0, Integer p1, Integer p2, com.orange.oab.contactless.packid.domain.Transaction p3 ) {
		 /* .locals 0 */
		 int p3 = 0; // const/4 p3, 0x0
		 /* .line 1 */
		 (( android.view.LayoutInflater ) p1 ).inflate ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
	 } // .end method
	 public void b ( Object p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 (( e.h.b.a.m.d ) p1 ).B ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->B()Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* const p1, 0x7f080145 */
			 /* .line 2 */
			 (( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
			 int v0 = 0; // const/4 v0, 0x0
			 (( android.view.View ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
		 } // :cond_0
		 return;
	 } // .end method
	 public Integer s ( ) {
		 /* .locals 1 */
		 /* const v0, 0x7f0b001c */
	 } // .end method
	 public Integer t ( ) {
		 /* .locals 1 */
		 /* const v0, 0x7f0b006b */
	 } // .end method
