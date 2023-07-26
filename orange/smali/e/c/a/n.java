public class e.c.a.n implements java.lang.Cloneable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public Float b;
	 public Float c;
	 public Float d;
	 public Float e;
	 /* # direct methods */
	 public e.c.a.n ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Le/c/a/n;->b:F */
		 /* .line 3 */
		 /* iput p2, p0, Le/c/a/n;->c:F */
		 /* .line 4 */
		 /* iput p3, p0, Le/c/a/n;->d:F */
		 /* .line 5 */
		 /* iput p4, p0, Le/c/a/n;->e:F */
		 return;
	 } // .end method
	 public static e.c.a.n a ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/c/a/n; */
		 /* sub-float/2addr p2, p0 */
		 /* sub-float/2addr p3, p1 */
		 /* invoke-direct {v0, p0, p1, p2, p3}, Le/c/a/n;-><init>(FFFF)V */
	 } // .end method
	 /* # virtual methods */
	 public Float a ( ) {
		 /* .locals 2 */
		 /* .line 2 */
		 /* iget v0, p0, Le/c/a/n;->b:F */
		 /* iget v1, p0, Le/c/a/n;->d:F */
		 /* add-float/2addr v0, v1 */
	 } // .end method
	 public void a ( Object p0 ) {
		 /* .locals 2 */
		 /* .line 3 */
		 /* iget v0, p1, Le/c/a/n;->b:F */
		 /* iget v1, p0, Le/c/a/n;->b:F */
		 /* cmpg-float v1, v0, v1 */
		 /* if-gez v1, :cond_0 */
		 /* iput v0, p0, Le/c/a/n;->b:F */
		 /* .line 4 */
	 } // :cond_0
	 /* iget v0, p1, Le/c/a/n;->c:F */
	 /* iget v1, p0, Le/c/a/n;->c:F */
	 /* cmpg-float v1, v0, v1 */
	 /* if-gez v1, :cond_1 */
	 /* iput v0, p0, Le/c/a/n;->c:F */
	 /* .line 5 */
} // :cond_1
v0 = (( e.c.a.n ) p1 ).a ( ); // invoke-virtual {p1}, Le/c/a/n;->a()F
v1 = (( e.c.a.n ) p0 ).a ( ); // invoke-virtual {p0}, Le/c/a/n;->a()F
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_2 */
v0 = (( e.c.a.n ) p1 ).a ( ); // invoke-virtual {p1}, Le/c/a/n;->a()F
/* iget v1, p0, Le/c/a/n;->b:F */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Le/c/a/n;->d:F */
/* .line 6 */
} // :cond_2
v0 = (( e.c.a.n ) p1 ).b ( ); // invoke-virtual {p1}, Le/c/a/n;->b()F
v1 = (( e.c.a.n ) p0 ).b ( ); // invoke-virtual {p0}, Le/c/a/n;->b()F
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_3 */
p1 = (( e.c.a.n ) p1 ).b ( ); // invoke-virtual {p1}, Le/c/a/n;->b()F
/* iget v0, p0, Le/c/a/n;->c:F */
/* sub-float/2addr p1, v0 */
/* iput p1, p0, Le/c/a/n;->e:F */
} // :cond_3
return;
} // .end method
public Float b ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Le/c/a/n;->c:F */
/* iget v1, p0, Le/c/a/n;->e:F */
/* add-float/2addr v0, v1 */
} // .end method
public android.graphics.RectF d ( ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Landroid/graphics/RectF; */
/* iget v1, p0, Le/c/a/n;->b:F */
/* iget v2, p0, Le/c/a/n;->c:F */
v3 = (( e.c.a.n ) p0 ).a ( ); // invoke-virtual {p0}, Le/c/a/n;->a()F
v4 = (( e.c.a.n ) p0 ).b ( ); // invoke-virtual {p0}, Le/c/a/n;->b()F
/* invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V */
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "["; // const-string v1, "["
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v1, p0, Le/c/a/n;->b:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = " "; // const-string v1, " "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Le/c/a/n;->c:F */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Le/c/a/n;->d:F */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/c/a/n;->e:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "]"; // const-string v1, "]"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
