public class inal extends e.f.c.s.p {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final Long b;
	 public final Long c;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Le/f/c/s/p;-><init>()V */
		 /* .line 3 */
		 this.a = p1;
		 /* .line 4 */
		 /* iput-wide p2, p0, Le/f/c/s/c;->b:J */
		 /* .line 5 */
		 /* iput-wide p4, p0, Le/f/c/s/c;->c:J */
		 return;
	 } // .end method
	 public inal ( ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct/range {p0 ..p5}, Le/f/c/s/c;-><init>(Ljava/lang/String;JJ)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
	 public Long b ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget-wide v0, p0, Le/f/c/s/c;->c:J */
		 /* return-wide v0 */
	 } // .end method
	 public Long c ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget-wide v0, p0, Le/f/c/s/c;->b:J */
		 /* return-wide v0 */
	 } // .end method
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 7 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-ne p1, p0, :cond_0 */
		 /* .line 1 */
	 } // :cond_0
	 /* instance-of v1, p1, Le/f/c/s/p; */
	 int v2 = 0; // const/4 v2, 0x0
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 /* .line 2 */
		 /* check-cast p1, Le/f/c/s/p; */
		 /* .line 3 */
		 v1 = this.a;
		 (( e.f.c.s.p ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/s/p;->a()Ljava/lang/String;
		 v1 = 		 (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* iget-wide v3, p0, Le/f/c/s/c;->b:J */
			 /* .line 4 */
			 (( e.f.c.s.p ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/s/p;->c()J
			 /* move-result-wide v5 */
			 /* cmp-long v1, v3, v5 */
			 /* if-nez v1, :cond_1 */
			 /* iget-wide v3, p0, Le/f/c/s/c;->c:J */
			 /* .line 5 */
			 (( e.f.c.s.p ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/s/p;->b()J
			 /* move-result-wide v5 */
			 /* cmp-long p1, v3, v5 */
			 /* if-nez p1, :cond_1 */
		 } // :cond_1
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_2
} // .end method
public Integer hashCode ( ) {
/* .locals 7 */
/* .line 1 */
v0 = this.a;
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
/* const v1, 0xf4243 */
/* xor-int/2addr v0, v1 */
/* mul-int v0, v0, v1 */
/* .line 2 */
/* iget-wide v2, p0, Le/f/c/s/c;->b:J */
/* const/16 v4, 0x20 */
/* ushr-long v5, v2, v4 */
/* xor-long/2addr v2, v5 */
/* long-to-int v3, v2 */
/* xor-int/2addr v0, v3 */
/* mul-int v0, v0, v1 */
/* .line 3 */
/* iget-wide v1, p0, Le/f/c/s/c;->c:J */
/* ushr-long v3, v1, v4 */
/* xor-long/2addr v1, v3 */
/* long-to-int v2, v1 */
/* xor-int/2addr v0, v2 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "InstallationTokenResult{token="; // const-string v1, "InstallationTokenResult{token="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", tokenExpirationTimestamp="; // const-string v1, ", tokenExpirationTimestamp="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v1, p0, Le/f/c/s/c;->b:J */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = ", tokenCreationTimestamp="; // const-string v1, ", tokenCreationTimestamp="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v1, p0, Le/f/c/s/c;->c:J */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
