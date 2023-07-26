public class e.c.a.c2 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Float a;
	 public Float b;
	 public Float c;
	 public Float d;
	 /* # direct methods */
	 public e.c.a.c2 ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 /* iput p1, p0, Le/c/a/c2;->c:F */
		 /* iput p1, p0, Le/c/a/c2;->d:F */
		 /* .line 3 */
		 /* iput p2, p0, Le/c/a/c2;->a:F */
		 /* .line 4 */
		 /* iput p3, p0, Le/c/a/c2;->b:F */
		 /* mul-float p1, p4, p4 */
		 /* mul-float p2, p5, p5 */
		 /* add-float/2addr p1, p2 */
		 /* float-to-double p1, p1 */
		 /* .line 5 */
		 java.lang.Math .sqrt ( p1,p2 );
		 /* move-result-wide p1 */
		 /* const-wide/16 v0, 0x0 */
		 /* cmpl-double p3, p1, v0 */
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 /* float-to-double p3, p4 */
			 /* div-double/2addr p3, p1 */
			 /* double-to-float p3, p3 */
			 /* .line 6 */
			 /* iput p3, p0, Le/c/a/c2;->c:F */
			 /* float-to-double p3, p5 */
			 /* div-double/2addr p3, p1 */
			 /* double-to-float p1, p3 */
			 /* .line 7 */
			 /* iput p1, p0, Le/c/a/c2;->d:F */
		 } // :cond_0
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Float p0, Float p1 ) {
		 /* .locals 5 */
		 /* .line 1 */
		 /* iget v0, p0, Le/c/a/c2;->a:F */
		 /* sub-float/2addr p1, v0 */
		 /* .line 2 */
		 /* iget v0, p0, Le/c/a/c2;->b:F */
		 /* sub-float/2addr p2, v0 */
		 /* mul-float v0, p1, p1 */
		 /* mul-float v1, p2, p2 */
		 /* add-float/2addr v0, v1 */
		 /* float-to-double v0, v0 */
		 /* .line 3 */
		 java.lang.Math .sqrt ( v0,v1 );
		 /* move-result-wide v0 */
		 /* const-wide/16 v2, 0x0 */
		 /* cmpl-double v4, v0, v2 */
		 if ( v4 != null) { // if-eqz v4, :cond_0
			 /* .line 4 */
			 /* iget v2, p0, Le/c/a/c2;->c:F */
			 /* float-to-double v3, p1 */
			 /* div-double/2addr v3, v0 */
			 /* double-to-float p1, v3 */
			 /* add-float/2addr v2, p1 */
			 /* iput v2, p0, Le/c/a/c2;->c:F */
			 /* .line 5 */
			 /* iget p1, p0, Le/c/a/c2;->d:F */
			 /* float-to-double v2, p2 */
			 /* div-double/2addr v2, v0 */
			 /* double-to-float p2, v2 */
			 /* add-float/2addr p1, p2 */
			 /* iput p1, p0, Le/c/a/c2;->d:F */
		 } // :cond_0
		 return;
	 } // .end method
	 public void a ( e.c.a.c2 p0 ) {
		 /* .locals 2 */
		 /* .line 6 */
		 /* iget v0, p0, Le/c/a/c2;->c:F */
		 /* iget v1, p1, Le/c/a/c2;->c:F */
		 /* add-float/2addr v0, v1 */
		 /* iput v0, p0, Le/c/a/c2;->c:F */
		 /* .line 7 */
		 /* iget v0, p0, Le/c/a/c2;->d:F */
		 /* iget p1, p1, Le/c/a/c2;->d:F */
		 /* add-float/2addr v0, p1 */
		 /* iput v0, p0, Le/c/a/c2;->d:F */
		 return;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "("; // const-string v1, "("
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* iget v1, p0, Le/c/a/c2;->a:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ","; // const-string v1, ","
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v2, p0, Le/c/a/c2;->b:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v2 = " "; // const-string v2, " "
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v2, p0, Le/c/a/c2;->c:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Le/c/a/c2;->d:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ")"; // const-string v1, ")"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
