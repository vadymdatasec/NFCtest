public class m.a.a.c.f.a implements m.a.a.c.f.b implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.List b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Lm/a/a/c/g/a<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Object;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public m.a.a.c.f.a ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( java.lang.String p0 ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* const/16 v1, 0x100 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 2 */
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 3 */
} // :cond_0
p1 = p1 = this.b;
/* if-lez p1, :cond_4 */
/* .line 4 */
p1 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
/* if-lez p1, :cond_1 */
/* const/16 p1, 0xa */
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // :cond_1
final String p1 = "Exception Context:\n"; // const-string p1, "Exception Context:\n"
/* .line 6 */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
int p1 = 0; // const/4 p1, 0x0
/* .line 7 */
v1 = this.b;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast v2, Lm/a/a/c/g/a; */
final String v3 = "\t["; // const-string v3, "\t["
/* .line 8 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 p1, p1, 0x1 */
/* .line 9 */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* const/16 v3, 0x3a */
/* .line 10 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 11 */
(( m.a.a.c.g.a ) v2 ).getKey ( ); // invoke-virtual {v2}, Lm/a/a/c/g/a;->getKey()Ljava/lang/Object;
/* check-cast v3, Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "="; // const-string v3, "="
/* .line 12 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 13 */
(( m.a.a.c.g.a ) v2 ).getValue ( ); // invoke-virtual {v2}, Lm/a/a/c/g/a;->getValue()Ljava/lang/Object;
/* if-nez v2, :cond_2 */
final String v2 = "null"; // const-string v2, "null"
/* .line 14 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 15 */
} // :cond_2
try { // :try_start_0
(( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v2 */
/* .line 16 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Exception thrown on toString(): "; // const-string v4, "Exception thrown on toString(): "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
m.a.a.c.f.c .a ( v2 );
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 17 */
} // :goto_1
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :goto_2
final String v2 = "]\n"; // const-string v2, "]\n"
/* .line 18 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_3
final String p1 = "---------------------------------"; // const-string p1, "---------------------------------"
/* .line 19 */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 20 */
} // :cond_4
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
