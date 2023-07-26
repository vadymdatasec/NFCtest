public class c.w.a.a.o extends c.w.a.a.s {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public c.w.a.a.o ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/w/a/a/s;-><init>()V */
		 return;
	 } // .end method
	 public c.w.a.a.o ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1}, Lc/w/a/a/s;-><init>(Lc/w/a/a/s;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.content.res.Resources p0, android.util.AttributeSet p1, android.content.res.Resources$Theme p2, org.xmlpull.v1.XmlPullParser p3 ) {
		 /* .locals 1 */
		 final String v0 = "pathData"; // const-string v0, "pathData"
		 /* .line 1 */
		 v0 = 		 c.h.f.i.t .a ( p4,v0 );
		 /* if-nez v0, :cond_0 */
		 return;
		 /* .line 2 */
	 } // :cond_0
	 v0 = c.w.a.a.a.d;
	 c.h.f.i.t .a ( p1,p3,p2,v0 );
	 /* .line 3 */
	 (( c.w.a.a.o ) p0 ).a ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Lc/w/a/a/o;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V
	 /* .line 4 */
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 return;
} // .end method
public final void a ( android.content.res.TypedArray p0, org.xmlpull.v1.XmlPullParser p1 ) {
	 /* .locals 3 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 5 */
	 (( android.content.res.TypedArray ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 6 */
		 this.b = v1;
	 } // :cond_0
	 int v1 = 1; // const/4 v1, 0x1
	 /* .line 7 */
	 (( android.content.res.TypedArray ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 8 */
		 c.h.g.e .a ( v1 );
		 this.a = v1;
	 } // :cond_1
	 int v1 = 2; // const/4 v1, 0x2
	 final String v2 = "fillType"; // const-string v2, "fillType"
	 /* .line 9 */
	 p1 = 	 c.h.f.i.t .b ( p1,p2,v2,v1,v0 );
	 /* iput p1, p0, Lc/w/a/a/s;->c:I */
	 return;
} // .end method
public Boolean b ( ) {
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
