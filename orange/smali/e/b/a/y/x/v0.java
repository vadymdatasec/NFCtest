public class e.b.a.y.x.v0 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<Data:", */
	 /* "Ljava/lang/Object;", */
	 /* "ResourceType:", */
	 /* "Ljava/lang/Object;", */
	 /* "Transcode:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final c.h.m.d a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/h/m/d<", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Throwable;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
public final java.util.List b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "+", */
/* "Le/b/a/y/x/w<", */
/* "TData;TResourceType;TTranscode;>;>;" */
/* } */
} // .end annotation
} // .end field
public final java.lang.String c;
/* # direct methods */
public e.b.a.y.x.v0 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "TData;>;", */
/* "Ljava/lang/Class<", */
/* "TResourceType;>;", */
/* "Ljava/lang/Class<", */
/* "TTranscode;>;", */
/* "Ljava/util/List<", */
/* "Le/b/a/y/x/w<", */
/* "TData;TResourceType;TTranscode;>;>;", */
/* "Lc/h/m/d<", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Throwable;", */
/* ">;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p5;
/* .line 3 */
e.b.a.e0.r .a ( p4 );
/* check-cast p4, Ljava/util/List; */
this.b = p4;
/* .line 4 */
/* new-instance p4, Ljava/lang/StringBuilder; */
/* invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V */
final String p5 = "Failed LoadPath{"; // const-string p5, "Failed LoadPath{"
(( java.lang.StringBuilder ) p4 ).append ( p5 ); // invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 5 */
(( java.lang.Class ) p1 ).getSimpleName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) p4 ).append ( p1 ); // invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "->"; // const-string p1, "->"
(( java.lang.StringBuilder ) p4 ).append ( p1 ); // invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 6 */
(( java.lang.Class ) p2 ).getSimpleName ( ); // invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) p4 ).append ( p2 ); // invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( p1 ); // invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 7 */
(( java.lang.Class ) p3 ).getSimpleName ( ); // invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) p4 ).append ( p1 ); // invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "}"; // const-string p1, "}"
(( java.lang.StringBuilder ) p4 ).append ( p1 ); // invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).toString ( ); // invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.c = p1;
return;
} // .end method
/* # virtual methods */
public e.b.a.y.x.y0 a ( Object p0, Object p1, Integer p2, Integer p3, Object p4 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/w/g<", */
/* "TData;>;", */
/* "Le/b/a/y/r;", */
/* "II", */
/* "Le/b/a/y/x/v<", */
/* "TResourceType;>;)", */
/* "Le/b/a/y/x/y0<", */
/* "TTranscode;>;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/bumptech/glide/load/engine/GlideException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
e.b.a.e0.r .a ( v0 );
/* check-cast v0, Ljava/util/List; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move-object v6, p5 */
/* move-object v7, v0 */
/* .line 2 */
try { // :try_start_0
/* invoke-virtual/range {v1 ..v7}, Le/b/a/y/x/v0;->a(Le/b/a/y/w/g;Le/b/a/y/r;IILe/b/a/y/x/v;Ljava/util/List;)Le/b/a/y/x/y0; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 3 */
p2 = this.a;
/* :catchall_0 */
/* move-exception p1 */
p2 = this.a;
/* .line 4 */
/* throw p1 */
} // .end method
public final e.b.a.y.x.y0 a ( Object p0, Object p1, Integer p2, Integer p3, Object p4, java.util.List p5 ) {
/* .locals 12 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/w/g<", */
/* "TData;>;", */
/* "Le/b/a/y/r;", */
/* "II", */
/* "Le/b/a/y/x/v<", */
/* "TResourceType;>;", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Throwable;", */
/* ">;)", */
/* "Le/b/a/y/x/y0<", */
/* "TTranscode;>;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/bumptech/glide/load/engine/GlideException; */
/* } */
} // .end annotation
/* move-object v1, p0 */
/* move-object/from16 v2, p6 */
/* .line 5 */
v3 = v0 = this.b;
int v0 = 0; // const/4 v0, 0x0
int v4 = 0; // const/4 v4, 0x0
/* move-object v4, v0 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v5, v3, :cond_1 */
/* .line 6 */
v0 = this.b;
/* move-object v6, v0 */
/* check-cast v6, Le/b/a/y/x/w; */
/* move-object v7, p1 */
/* move v8, p3 */
/* move/from16 v9, p4 */
/* move-object v10, p2 */
/* move-object/from16 v11, p5 */
/* .line 7 */
try { // :try_start_0
/* invoke-virtual/range {v6 ..v11}, Le/b/a/y/x/w;->a(Le/b/a/y/w/g;IILe/b/a/y/r;Le/b/a/y/x/v;)Le/b/a/y/x/y0; */
/* :try_end_0 */
/* .catch Lcom/bumptech/glide/load/engine/GlideException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-object v4, v0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v6, v0 */
/* .line 8 */
} // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_0
} // :cond_0
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_1
} // :goto_2
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 9 */
} // :cond_2
/* new-instance v0, Lcom/bumptech/glide/load/engine/GlideException; */
v3 = this.c;
/* new-instance v4, Ljava/util/ArrayList; */
/* invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* invoke-direct {v0, v3, v4}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V */
/* throw v0 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "LoadPath{decodePaths="; // const-string v1, "LoadPath{decodePaths="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
java.util.Arrays .toString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
