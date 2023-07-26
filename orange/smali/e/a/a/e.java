public class e.a.a.e implements e.a.a.x {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public Integer a;
	 public Integer b;
	 public final Integer c;
	 public final Float d;
	 /* # direct methods */
	 public e.a.a.e ( ) {
		 /* .locals 3 */
		 /* const/16 v0, 0x9c4 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* const/high16 v2, 0x3f800000 # 1.0f */
		 /* .line 1 */
		 /* invoke-direct {p0, v0, v1, v2}, Le/a/a/e;-><init>(IIF)V */
		 return;
	 } // .end method
	 public e.a.a.e ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 3 */
		 /* iput p1, p0, Le/a/a/e;->a:I */
		 /* .line 4 */
		 /* iput p2, p0, Le/a/a/e;->c:I */
		 /* .line 5 */
		 /* iput p3, p0, Le/a/a/e;->d:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Le/a/a/e;->a:I */
	 } // .end method
	 public void a ( com.android.volley.VolleyError p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/android/volley/VolleyError; */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 /* iget v0, p0, Le/a/a/e;->b:I */
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* iput v0, p0, Le/a/a/e;->b:I */
	 /* .line 3 */
	 /* iget v0, p0, Le/a/a/e;->a:I */
	 /* int-to-float v1, v0 */
	 /* iget v2, p0, Le/a/a/e;->d:F */
	 /* mul-float v1, v1, v2 */
	 /* float-to-int v1, v1 */
	 /* add-int/2addr v0, v1 */
	 /* iput v0, p0, Le/a/a/e;->a:I */
	 /* .line 4 */
	 v0 = 	 (( e.a.a.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/a/a/e;->c()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 return;
		 /* .line 5 */
	 } // :cond_0
	 /* throw p1 */
} // .end method
public Integer b ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget v0, p0, Le/a/a/e;->b:I */
} // .end method
public Boolean c ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* iget v0, p0, Le/a/a/e;->b:I */
	 /* iget v1, p0, Le/a/a/e;->c:I */
	 /* if-gt v0, v1, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
