public class com.orange.hce.proto.activity.DefaultBadgeDetailActivity extends e.h.b.a.l.d1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.orange.hce.proto.activity.DefaultBadgeDetailActivity ( ) {
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
		 /* .locals 4 */
		 /* .line 1 */
		 p1 = 		 (( e.h.b.a.m.d ) p1 ).B ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->B()Z
		 int v0 = 0; // const/4 v0, 0x0
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* const p1, 0x7f080145 */
			 /* .line 2 */
			 (( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
			 (( android.view.View ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
		 } // :cond_0
		 final String p1 = "nfco.DefaultBadgeAct"; // const-string p1, "nfco.DefaultBadgeAct"
		 final String v1 = "DefaultBadgeDetailActivity : showBadgeDetails"; // const-string v1, "DefaultBadgeDetailActivity : showBadgeDetails"
		 /* .line 3 */
		 android.util.Log .i ( p1,v1 );
		 /* const p1, 0x7f080082 */
		 /* .line 4 */
		 (( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
		 /* check-cast p1, Landroid/widget/TextView; */
		 /* const v1, 0x7f0e0088 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* new-array v2, v2, [Ljava/lang/Object; */
		 /* const v3, 0x7f0e008c */
		 /* .line 5 */
		 (( android.app.Activity ) p0 ).getString ( v3 ); // invoke-virtual {p0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
		 /* aput-object v3, v2, v0 */
		 (( android.app.Activity ) p0 ).getString ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
		 android.text.Html .fromHtml ( v0 );
		 (( android.widget.TextView ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 /* .line 6 */
		 android.text.method.LinkMovementMethod .getInstance ( );
		 (( android.widget.TextView ) p1 ).setMovementMethod ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V
		 return;
	 } // .end method
	 public Integer s ( ) {
		 /* .locals 1 */
		 /* const v0, 0x7f0b001f */
	 } // .end method
	 public Integer t ( ) {
		 /* .locals 1 */
		 /* const v0, 0x7f0b006b */
	 } // .end method
