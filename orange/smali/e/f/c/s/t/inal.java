public class inal extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum<", */
	 /* "Le/f/c/s/t/e;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final e.f.c.s.t.e b;
public static final e.f.c.s.t.e c;
public static final e.f.c.s.t.e d;
public static final e.f.c.s.t.e e;
public static final e.f.c.s.t.e f;
public static final e.f.c.s.t.e g; //synthetic
/* # direct methods */
public static inal ( ) {
	 /* .locals 8 */
	 /* .line 1 */
	 /* new-instance v0, Le/f/c/s/t/e; */
	 int v1 = 0; // const/4 v1, 0x0
	 final String v2 = "ATTEMPT_MIGRATION"; // const-string v2, "ATTEMPT_MIGRATION"
	 /* invoke-direct {v0, v2, v1}, Le/f/c/s/t/e;-><init>(Ljava/lang/String;I)V */
	 /* .line 2 */
	 /* new-instance v0, Le/f/c/s/t/e; */
	 int v2 = 1; // const/4 v2, 0x1
	 final String v3 = "NOT_GENERATED"; // const-string v3, "NOT_GENERATED"
	 /* invoke-direct {v0, v3, v2}, Le/f/c/s/t/e;-><init>(Ljava/lang/String;I)V */
	 /* .line 3 */
	 /* new-instance v0, Le/f/c/s/t/e; */
	 int v3 = 2; // const/4 v3, 0x2
	 final String v4 = "UNREGISTERED"; // const-string v4, "UNREGISTERED"
	 /* invoke-direct {v0, v4, v3}, Le/f/c/s/t/e;-><init>(Ljava/lang/String;I)V */
	 /* .line 4 */
	 /* new-instance v0, Le/f/c/s/t/e; */
	 int v4 = 3; // const/4 v4, 0x3
	 final String v5 = "REGISTERED"; // const-string v5, "REGISTERED"
	 /* invoke-direct {v0, v5, v4}, Le/f/c/s/t/e;-><init>(Ljava/lang/String;I)V */
	 /* .line 5 */
	 /* new-instance v0, Le/f/c/s/t/e; */
	 int v5 = 4; // const/4 v5, 0x4
	 final String v6 = "REGISTER_ERROR"; // const-string v6, "REGISTER_ERROR"
	 /* invoke-direct {v0, v6, v5}, Le/f/c/s/t/e;-><init>(Ljava/lang/String;I)V */
	 int v6 = 5; // const/4 v6, 0x5
	 /* new-array v6, v6, [Le/f/c/s/t/e; */
	 /* .line 6 */
	 v7 = e.f.c.s.t.e.b;
	 /* aput-object v7, v6, v1 */
	 v1 = e.f.c.s.t.e.c;
	 /* aput-object v1, v6, v2 */
	 v1 = e.f.c.s.t.e.d;
	 /* aput-object v1, v6, v3 */
	 v1 = e.f.c.s.t.e.e;
	 /* aput-object v1, v6, v4 */
	 /* aput-object v0, v6, v5 */
	 return;
} // .end method
public inal ( ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "()V" */
	 /* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static e.f.c.s.t.e valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Le/f/c/s/t/e; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Le/f/c/s/t/e; */
} // .end method
public static e.f.c.s.t.e values ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.f.c.s.t.e.g;
(( e.f.c.s.t.e ) v0 ).clone ( ); // invoke-virtual {v0}, [Le/f/c/s/t/e;->clone()Ljava/lang/Object;
/* check-cast v0, [Le/f/c/s/t/e; */
} // .end method
z v1, :cond_5 */
	 } // :cond_2
	 (( e.f.c.s.t.h ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->a()Ljava/lang/String;
	 v1 = 	 (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_5
	 } // :goto_1
	 v1 = this.d;
	 /* if-nez v1, :cond_3 */
	 /* .line 6 */
	 (( e.f.c.s.t.h ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->e()Ljava/lang/String;
	 /* if-nez v1, :cond_5 */
} // :cond_3
(( e.f.c.s.t.h ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->e()Ljava/lang/String;
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_5
} // :goto_2
/* iget-wide v3, p0, Le/f/c/s/t/c;->e:J */
/* .line 7 */
(( e.f.c.s.t.h ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->b()J
/* move-result-wide v5 */
/* cmp-long v1, v3, v5 */
/* if-nez v1, :cond_5 */
/* iget-wide v3, p0, Le/f/c/s/t/c;->f:J */
/* .line 8 */
(( e.f.c.s.t.h ) p1 ).g ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->g()J
/* move-result-wide v5 */
/* cmp-long v1, v3, v5 */
/* if-nez v1, :cond_5 */
v1 = this.g;
/* if-nez v1, :cond_4 */
/* .line 9 */
(( e.f.c.s.t.h ) p1 ).d ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->d()Ljava/lang/String;
/* if-nez p1, :cond_5 */
} // :cond_4
(( e.f.c.s.t.h ) p1 ).d ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->d()Ljava/lang/String;
p1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_5
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
} // :goto_3
} // :cond_6
} // .end method
public e.f.c.s.t.e f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public Long g ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Le/f/c/s/t/c;->f:J */
/* return-wide v0 */
} // .end method
public Integer hashCode ( ) {
/* .locals 8 */
/* .line 1 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
} // :goto_0
/* const v2, 0xf4243 */
/* xor-int/2addr v0, v2 */
/* mul-int v0, v0, v2 */
/* .line 2 */
v3 = this.b;
v3 = (( java.lang.Enum ) v3 ).hashCode ( ); // invoke-virtual {v3}, Ljava/lang/Enum;->hashCode()I
/* xor-int/2addr v0, v3 */
/* mul-int v0, v0, v2 */
/* .line 3 */
v3 = this.c;
/* if-nez v3, :cond_1 */
int v3 = 0; // const/4 v3, 0x0
} // :cond_1
v3 = (( java.lang.String ) v3 ).hashCode ( ); // invoke-virtual {v3}, Ljava/lang/String;->hashCode()I
} // :goto_1
/* xor-int/2addr v0, v3 */
/* mul-int v0, v0, v2 */
/* .line 4 */
v3 = this.d;
/* if-nez v3, :cond_2 */
int v3 = 0; // const/4 v3, 0x0
} // :cond_2
v3 = (( java.lang.String ) v3 ).hashCode ( ); // invoke-virtual {v3}, Ljava/lang/String;->hashCode()I
} // :goto_2
/* xor-int/2addr v0, v3 */
/* mul-int v0, v0, v2 */
/* .line 5 */
/* iget-wide v3, p0, Le/f/c/s/t/c;->e:J */
/* const/16 v5, 0x20 */
/* ushr-long v6, v3, v5 */
/* xor-long/2addr v3, v6 */
/* long-to-int v4, v3 */
/* xor-int/2addr v0, v4 */
/* mul-int v0, v0, v2 */
/* .line 6 */
/* iget-wide v3, p0, Le/f/c/s/t/c;->f:J */
/* ushr-long v5, v3, v5 */
/* xor-long/2addr v3, v5 */
/* long-to-int v4, v3 */
/* xor-int/2addr v0, v4 */
/* mul-int v0, v0, v2 */
/* .line 7 */
v2 = this.g;
/* if-nez v2, :cond_3 */
} // :cond_3
v1 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
} // :goto_3
/* xor-int/2addr v0, v1 */
} // .end method
public e.f.c.s.t.g m ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Le/f/c/s/t/b; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Le/f/c/s/t/b;-><init>(Le/f/c/s/t/h;Le/f/c/s/t/a;)V */
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "PersistedInstallationEntry{firebaseInstallationId="; // const-string v1, "PersistedInstallationEntry{firebaseInstallationId="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", registrationStatus="; // const-string v1, ", registrationStatus="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", authToken="; // const-string v1, ", authToken="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", refreshToken="; // const-string v1, ", refreshToken="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.d;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", expiresInSecs="; // const-string v1, ", expiresInSecs="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v1, p0, Le/f/c/s/t/c;->e:J */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = ", tokenCreationEpochInSecs="; // const-string v1, ", tokenCreationEpochInSecs="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v1, p0, Le/f/c/s/t/c;->f:J */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = ", fisError="; // const-string v1, ", fisError="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.g;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
