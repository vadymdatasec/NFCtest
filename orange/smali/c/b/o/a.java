public class c.b.o.a implements android.text.method.TransformationMethod {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.util.Locale b;
	 /* # direct methods */
	 public c.b.o.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) p1 ).getConfiguration ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
		 p1 = this.locale;
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.CharSequence getTransformation ( java.lang.CharSequence p0, android.view.View p1 ) {
		 /* .locals 0 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 1 */
			 p2 = this.b;
			 (( java.lang.String ) p1 ).toUpperCase ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // :goto_0
} // .end method
public void onFocusChanged ( android.view.View p0, java.lang.CharSequence p1, Boolean p2, Integer p3, android.graphics.Rect p4 ) {
	 /* .locals 0 */
	 return;
} // .end method
