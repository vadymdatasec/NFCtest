public class inal extends e.f.a.d.a.d.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer a;
	 public final Long b;
	 public final Long c;
	 public final Integer d;
	 public final java.lang.String e;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Le/f/a/d/a/d/a;-><init>()V */
		 /* iput p1, p0, Le/f/a/d/a/d/b;->a:I */
		 /* iput-wide p2, p0, Le/f/a/d/a/d/b;->b:J */
		 /* iput-wide p4, p0, Le/f/a/d/a/d/b;->c:J */
		 /* iput p6, p0, Le/f/a/d/a/d/b;->d:I */
		 if ( p7 != null) { // if-eqz p7, :cond_0
			 this.e = p7;
			 return;
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/NullPointerException; */
		 final String p2 = "Null packageName"; // const-string p2, "Null packageName"
		 /* invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 /* # virtual methods */
	 public final Long a ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Le/f/a/d/a/d/b;->b:J */
		 /* return-wide v0 */
	 } // .end method
	 public final Integer b ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Le/f/a/d/a/d/b;->d:I */
	 } // .end method
	 public final Integer c ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Le/f/a/d/a/d/b;->a:I */
	 } // .end method
	 public final java.lang.String d ( ) {
		 /* .locals 1 */
		 v0 = this.e;
	 } // .end method
	 public final Long e ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Le/f/a/d/a/d/b;->c:J */
		 /* return-wide v0 */
	 } // .end method
	 public final Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 7 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-ne p1, p0, :cond_0 */
	 } // :cond_0
	 /* instance-of v1, p1, Le/f/a/d/a/d/a; */
	 int v2 = 0; // const/4 v2, 0x0
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* check-cast p1, Le/f/a/d/a/d/a; */
		 /* iget v1, p0, Le/f/a/d/a/d/b;->a:I */
		 v3 = 		 (( e.f.a.d.a.d.a ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/a/d/a/d/a;->c()I
		 /* if-ne v1, v3, :cond_1 */
		 /* iget-wide v3, p0, Le/f/a/d/a/d/b;->b:J */
		 (( e.f.a.d.a.d.a ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/d/a/d/a;->a()J
		 /* move-result-wide v5 */
		 /* cmp-long v1, v3, v5 */
		 /* if-nez v1, :cond_1 */
		 /* iget-wide v3, p0, Le/f/a/d/a/d/b;->c:J */
		 (( e.f.a.d.a.d.a ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/a/d/a/d/a;->e()J
		 /* move-result-wide v5 */
		 /* cmp-long v1, v3, v5 */
		 /* if-nez v1, :cond_1 */
		 /* iget v1, p0, Le/f/a/d/a/d/b;->d:I */
		 v3 = 		 (( e.f.a.d.a.d.a ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/d/a/d/a;->b()I
		 /* if-ne v1, v3, :cond_1 */
		 v1 = this.e;
		 (( e.f.a.d.a.d.a ) p1 ).d ( ); // invoke-virtual {p1}, Le/f/a/d/a/d/a;->d()Ljava/lang/String;
		 p1 = 		 (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_1
		 } // :cond_1
	 } // .end method
	 public final Integer hashCode ( ) {
		 /* .locals 9 */
		 /* iget v0, p0, Le/f/a/d/a/d/b;->a:I */
		 /* iget-wide v1, p0, Le/f/a/d/a/d/b;->b:J */
		 /* iget-wide v3, p0, Le/f/a/d/a/d/b;->c:J */
		 /* const v5, 0xf4243 */
		 /* xor-int/2addr v0, v5 */
		 /* mul-int v0, v0, v5 */
		 /* const/16 v6, 0x20 */
		 /* ushr-long v7, v1, v6 */
		 /* xor-long/2addr v1, v7 */
		 /* long-to-int v2, v1 */
		 /* xor-int/2addr v0, v2 */
		 /* mul-int v0, v0, v5 */
		 /* ushr-long v1, v3, v6 */
		 /* xor-long/2addr v1, v3 */
		 /* long-to-int v2, v1 */
		 /* xor-int/2addr v0, v2 */
		 /* mul-int v0, v0, v5 */
		 /* iget v1, p0, Le/f/a/d/a/d/b;->d:I */
		 /* xor-int/2addr v0, v1 */
		 /* mul-int v0, v0, v5 */
		 v1 = this.e;
		 v1 = 		 (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
		 /* xor-int/2addr v0, v1 */
	 } // .end method
	 public final java.lang.String toString ( ) {
		 /* .locals 9 */
		 /* iget v0, p0, Le/f/a/d/a/d/b;->a:I */
		 /* iget-wide v1, p0, Le/f/a/d/a/d/b;->b:J */
		 /* iget-wide v3, p0, Le/f/a/d/a/d/b;->c:J */
		 /* iget v5, p0, Le/f/a/d/a/d/b;->d:I */
		 v6 = this.e;
		 v7 = 		 (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
		 /* new-instance v8, Ljava/lang/StringBuilder; */
		 /* add-int/lit16 v7, v7, 0xa4 */
		 /* invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V */
		 final String v7 = "InstallState{installStatus="; // const-string v7, "InstallState{installStatus="
		 (( java.lang.StringBuilder ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v8 ).append ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v0 = ", bytesDownloaded="; // const-string v0, ", bytesDownloaded="
		 (( java.lang.StringBuilder ) v8 ).append ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v8 ).append ( v1, v2 ); // invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
		 final String v0 = ", totalBytesToDownload="; // const-string v0, ", totalBytesToDownload="
		 (( java.lang.StringBuilder ) v8 ).append ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v8 ).append ( v3, v4 ); // invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
		 final String v0 = ", installErrorCode="; // const-string v0, ", installErrorCode="
		 (( java.lang.StringBuilder ) v8 ).append ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v8 ).append ( v5 ); // invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v0 = ", packageName="; // const-string v0, ", packageName="
		 (( java.lang.StringBuilder ) v8 ).append ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v0 = "}"; // const-string v0, "}"
		 (( java.lang.StringBuilder ) v8 ).append ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
