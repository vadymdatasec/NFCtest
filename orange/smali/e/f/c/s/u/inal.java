public class inal extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum<", */
	 /* "Le/f/c/s/u/l;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final e.f.c.s.u.l b;
public static final e.f.c.s.u.l c;
public static final e.f.c.s.u.l d;
public static final e.f.c.s.u.l e; //synthetic
/* # direct methods */
public static inal ( ) {
	 /* .locals 6 */
	 /* .line 1 */
	 /* new-instance v0, Le/f/c/s/u/l; */
	 int v1 = 0; // const/4 v1, 0x0
	 final String v2 = "OK"; // const-string v2, "OK"
	 /* invoke-direct {v0, v2, v1}, Le/f/c/s/u/l;-><init>(Ljava/lang/String;I)V */
	 /* .line 2 */
	 /* new-instance v0, Le/f/c/s/u/l; */
	 int v2 = 1; // const/4 v2, 0x1
	 final String v3 = "BAD_CONFIG"; // const-string v3, "BAD_CONFIG"
	 /* invoke-direct {v0, v3, v2}, Le/f/c/s/u/l;-><init>(Ljava/lang/String;I)V */
	 /* .line 3 */
	 /* new-instance v0, Le/f/c/s/u/l; */
	 int v3 = 2; // const/4 v3, 0x2
	 final String v4 = "AUTH_ERROR"; // const-string v4, "AUTH_ERROR"
	 /* invoke-direct {v0, v4, v3}, Le/f/c/s/u/l;-><init>(Ljava/lang/String;I)V */
	 int v4 = 3; // const/4 v4, 0x3
	 /* new-array v4, v4, [Le/f/c/s/u/l; */
	 /* .line 4 */
	 v5 = e.f.c.s.u.l.b;
	 /* aput-object v5, v4, v1 */
	 v1 = e.f.c.s.u.l.c;
	 /* aput-object v1, v4, v2 */
	 /* aput-object v0, v4, v3 */
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
public static e.f.c.s.u.l valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Le/f/c/s/u/l; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Le/f/c/s/u/l; */
} // .end method
public static e.f.c.s.u.l values ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.f.c.s.u.l.e;
(( e.f.c.s.u.l ) v0 ).clone ( ); // invoke-virtual {v0}, [Le/f/c/s/u/l;->clone()Ljava/lang/Object;
/* check-cast v0, [Le/f/c/s/u/l; */
} // .end method
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             v0 = this.a;
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
/* if-nez v3, :cond_1 */
int v3 = 0; // const/4 v3, 0x0
} // :cond_1
v3 = (( java.lang.String ) v3 ).hashCode ( ); // invoke-virtual {v3}, Ljava/lang/String;->hashCode()I
} // :goto_1
/* xor-int/2addr v0, v3 */
/* mul-int v0, v0, v2 */
/* .line 3 */
v3 = this.c;
/* if-nez v3, :cond_2 */
int v3 = 0; // const/4 v3, 0x0
} // :cond_2
v3 = (( java.lang.String ) v3 ).hashCode ( ); // invoke-virtual {v3}, Ljava/lang/String;->hashCode()I
} // :goto_2
/* xor-int/2addr v0, v3 */
/* mul-int v0, v0, v2 */
/* .line 4 */
v3 = this.d;
/* if-nez v3, :cond_3 */
int v3 = 0; // const/4 v3, 0x0
} // :cond_3
v3 = (( java.lang.Object ) v3 ).hashCode ( ); // invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I
} // :goto_3
/* xor-int/2addr v0, v3 */
/* mul-int v0, v0, v2 */
/* .line 5 */
v2 = this.e;
/* if-nez v2, :cond_4 */
} // :cond_4
v1 = (( java.lang.Enum ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/Enum;->hashCode()I
} // :goto_4
/* xor-int/2addr v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "InstallationResponse{uri="; // const-string v1, "InstallationResponse{uri="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", fid="; // const-string v1, ", fid="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", refreshToken="; // const-string v1, ", refreshToken="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", authToken="; // const-string v1, ", authToken="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.d;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", responseCode="; // const-string v1, ", responseCode="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.e;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
