public class c.b.q.v1 extends c.e.g {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/e/g<", */
	 /* "Ljava/lang/Integer;", */
	 /* "Landroid/graphics/PorterDuffColorFilter;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public c.b.q.v1 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1}, Lc/e/g;-><init>(I)V */
	 return;
} // .end method
public static Integer b ( Integer p0, android.graphics.PorterDuff$Mode p1 ) {
	 /* .locals 1 */
	 /* const/16 v0, 0x1f */
	 /* add-int/2addr p0, v0 */
	 /* mul-int/lit8 p0, p0, 0x1f */
	 /* .line 1 */
	 p1 = 	 (( android.graphics.PorterDuff$Mode ) p1 ).hashCode ( ); // invoke-virtual {p1}, Landroid/graphics/PorterDuff$Mode;->hashCode()I
	 /* add-int/2addr p0, p1 */
} // .end method
/* # virtual methods */
public android.graphics.PorterDuffColorFilter a ( Integer p0, android.graphics.PorterDuff$Mode p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p1 = 	 c.b.q.v1 .b ( p1,p2 );
	 java.lang.Integer .valueOf ( p1 );
	 (( c.e.g ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/e/g;->b(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast p1, Landroid/graphics/PorterDuffColorFilter; */
} // .end method
public android.graphics.PorterDuffColorFilter a ( Integer p0, android.graphics.PorterDuff$Mode p1, android.graphics.PorterDuffColorFilter p2 ) {
	 /* .locals 0 */
	 /* .line 2 */
	 p1 = 	 c.b.q.v1 .b ( p1,p2 );
	 java.lang.Integer .valueOf ( p1 );
	 (( c.e.g ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Lc/e/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast p1, Landroid/graphics/PorterDuffColorFilter; */
} // .end method
