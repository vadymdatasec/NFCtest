public class e.f.a.b.c.m.i {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.res.Resources a;
	 public final java.lang.String b;
	 /* # direct methods */
	 public e.f.a.b.c.m.i ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 e.f.a.b.c.m.h .a ( p1 );
		 /* .line 3 */
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 this.a = p1;
		 /* .line 4 */
		 /* .line 5 */
		 (( android.content.res.Resources ) p1 ).getResourcePackageName ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.a;
		 v1 = this.b;
		 final String v2 = "string"; // const-string v2, "string"
		 p1 = 		 (( android.content.res.Resources ) v0 ).getIdentifier ( p1, v2, v1 ); // invoke-virtual {v0, p1, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
		 /* if-nez p1, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
	 } // :cond_0
	 v0 = this.a;
	 (( android.content.res.Resources ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
} // .end method
