public class e.c.a.k2 extends e.c.a.j2 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Float a;
	 public final e.c.a.l2 b; //synthetic
	 /* # direct methods */
	 public e.c.a.k2 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 this.b = p1;
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Le/c/a/j2;-><init>(Le/c/a/l2;Le/c/a/j2;)V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 /* iput p1, p0, Le/c/a/k2;->a:F */
		 return;
	 } // .end method
	 public e.c.a.k2 ( ) { //synthethic
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1}, Le/c/a/k2;-><init>(Le/c/a/l2;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget v0, p0, Le/c/a/k2;->a:F */
		 v1 = this.b;
		 e.c.a.l2 .b ( v1 );
		 v1 = this.e;
		 p1 = 		 (( android.graphics.Paint ) v1 ).measureText ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
		 /* add-float/2addr v0, p1 */
		 /* iput v0, p0, Le/c/a/k2;->a:F */
		 return;
	 } // .end method
