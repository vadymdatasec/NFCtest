public class e.b.a.y.x.e1 implements e.b.a.y.x.l implements e.b.a.y.x.k {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.y.x.m b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/b/a/y/x/m<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public final e.b.a.y.x.k c;
public volatile Integer d;
public volatile e.b.a.y.x.h e;
public volatile java.lang.Object f;
public volatile e.b.a.y.y.v0 g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/y/v0<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
public volatile e.b.a.y.x.i h;
/* # direct methods */
public e.b.a.y.x.e1 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/x/m<", */
/* "*>;", */
/* "Le/b/a/y/x/k;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
/* .line 3 */
this.c = p2;
return;
} // .end method
/* # virtual methods */
public void a ( Object p0, java.lang.Exception p1, Object p2, Object p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/n;", */
/* "Ljava/lang/Exception;", */
/* "Le/b/a/y/w/e<", */
/* "*>;", */
/* "Le/b/a/y/a;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 51 */
p4 = this.c;
v0 = this.g;
v0 = this.c;
return;
} // .end method
public void a ( Object p0, java.lang.Object p1, Object p2, Object p3, Object p4 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/n;", */
/* "Ljava/lang/Object;", */
/* "Le/b/a/y/w/e<", */
/* "*>;", */
/* "Le/b/a/y/a;", */
/* "Le/b/a/y/n;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 50 */
v0 = this.c;
p4 = this.g;
p4 = this.c;
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move-object v5, p1 */
/* invoke-interface/range {v0 ..v5}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Object;Le/b/a/y/w/e;Le/b/a/y/a;Le/b/a/y/n;)V */
return;
} // .end method
public void a ( e.b.a.y.y.v0 p0, java.lang.Exception p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/y/v0<", */
/* "*>;", */
/* "Ljava/lang/Exception;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 49 */
v0 = this.c;
v1 = this.h;
p1 = this.c;
return;
} // .end method
public void a ( e.b.a.y.y.v0 p0, java.lang.Object p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/y/v0<", */
/* "*>;", */
/* "Ljava/lang/Object;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 42 */
v0 = this.b;
(( e.b.a.y.x.m ) v0 ).e ( ); // invoke-virtual {v0}, Le/b/a/y/x/m;->e()Le/b/a/y/x/c0;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 43 */
v1 = this.c;
v0 = (( e.b.a.y.x.c0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/b/a/y/x/c0;->a(Le/b/a/y/a;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 44 */
this.f = p2;
/* .line 45 */
p1 = this.c;
/* .line 46 */
} // :cond_0
v0 = this.c;
v1 = this.a;
v3 = this.c;
/* .line 47 */
v5 = this.h;
/* move-object v2, p2 */
/* .line 48 */
/* invoke-interface/range {v0 ..v5}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Object;Le/b/a/y/w/e;Le/b/a/y/a;Le/b/a/y/n;)V */
} // :goto_0
return;
} // .end method
public Boolean a ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.f;
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.f;
/* .line 3 */
this.f = v1;
/* .line 4 */
try { // :try_start_0
v0 = (( e.b.a.y.x.e1 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/b/a/y/x/e1;->a(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-nez v0, :cond_0 */
/* :catch_0 */
/* move-exception v0 */
int v3 = 3; // const/4 v3, 0x3
final String v4 = "SourceGenerator"; // const-string v4, "SourceGenerator"
/* .line 5 */
v3 = android.util.Log .isLoggable ( v4,v3 );
if ( v3 != null) { // if-eqz v3, :cond_0
final String v3 = "Failed to properly rewind or write data to cache"; // const-string v3, "Failed to properly rewind or write data to cache"
/* .line 6 */
android.util.Log .d ( v4,v3,v0 );
/* .line 7 */
} // :cond_0
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.e;
v0 = (( e.b.a.y.x.h ) v0 ).a ( ); // invoke-virtual {v0}, Le/b/a/y/x/h;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 8 */
} // :cond_1
this.e = v1;
/* .line 9 */
this.g = v1;
int v0 = 0; // const/4 v0, 0x0
} // :cond_2
} // :goto_0
/* if-nez v0, :cond_4 */
/* .line 10 */
v1 = (( e.b.a.y.x.e1 ) p0 ).c ( ); // invoke-virtual {p0}, Le/b/a/y/x/e1;->c()Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 11 */
v1 = this.b;
(( e.b.a.y.x.m ) v1 ).g ( ); // invoke-virtual {v1}, Le/b/a/y/x/m;->g()Ljava/util/List;
/* iget v3, p0, Le/b/a/y/x/e1;->d:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Le/b/a/y/x/e1;->d:I */
/* check-cast v1, Le/b/a/y/y/v0; */
this.g = v1;
/* .line 12 */
v1 = this.g;
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.b;
/* .line 13 */
(( e.b.a.y.x.m ) v1 ).e ( ); // invoke-virtual {v1}, Le/b/a/y/x/m;->e()Le/b/a/y/x/c0;
v3 = this.g;
v3 = this.c;
v1 = (( e.b.a.y.x.c0 ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Le/b/a/y/x/c0;->a(Le/b/a/y/a;)Z
/* if-nez v1, :cond_3 */
v1 = this.b;
v3 = this.g;
v3 = this.c;
/* .line 14 */
v1 = (( e.b.a.y.x.m ) v1 ).c ( v3 ); // invoke-virtual {v1, v3}, Le/b/a/y/x/m;->c(Ljava/lang/Class;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 15 */
} // :cond_3
v0 = this.g;
(( e.b.a.y.x.e1 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/b/a/y/x/e1;->b(Le/b/a/y/y/v0;)V
int v0 = 1; // const/4 v0, 0x1
} // :cond_4
} // .end method
public Boolean a ( e.b.a.y.y.v0 p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/y/v0<", */
/* "*>;)Z" */
/* } */
} // .end annotation
/* .line 16 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-ne v0, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Boolean a ( java.lang.Object p0 ) {
/* .locals 12 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
final String v0 = "SourceGenerator"; // const-string v0, "SourceGenerator"
/* .line 17 */
e.b.a.e0.m .a ( );
/* move-result-wide v1 */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 18 */
try { // :try_start_0
v5 = this.b;
(( e.b.a.y.x.m ) v5 ).a ( p1 ); // invoke-virtual {v5, p1}, Le/b/a/y/x/m;->a(Ljava/lang/Object;)Le/b/a/y/w/g;
/* .line 19 */
/* .line 20 */
v7 = this.b;
(( e.b.a.y.x.m ) v7 ).b ( v6 ); // invoke-virtual {v7, v6}, Le/b/a/y/x/m;->b(Ljava/lang/Object;)Le/b/a/y/d;
/* .line 21 */
/* new-instance v8, Le/b/a/y/x/j; */
v9 = this.b;
(( e.b.a.y.x.m ) v9 ).i ( ); // invoke-virtual {v9}, Le/b/a/y/x/m;->i()Le/b/a/y/r;
/* invoke-direct {v8, v7, v6, v9}, Le/b/a/y/x/j;-><init>(Le/b/a/y/d;Ljava/lang/Object;Le/b/a/y/r;)V */
/* .line 22 */
/* new-instance v6, Le/b/a/y/x/i; */
v9 = this.g;
v9 = this.a;
v10 = this.b;
(( e.b.a.y.x.m ) v10 ).l ( ); // invoke-virtual {v10}, Le/b/a/y/x/m;->l()Le/b/a/y/n;
/* invoke-direct {v6, v9, v10}, Le/b/a/y/x/i;-><init>(Le/b/a/y/n;Le/b/a/y/n;)V */
/* .line 23 */
v9 = this.b;
(( e.b.a.y.x.m ) v9 ).d ( ); // invoke-virtual {v9}, Le/b/a/y/x/m;->d()Le/b/a/y/x/g1/c;
/* .line 24 */
int v8 = 2; // const/4 v8, 0x2
/* .line 25 */
v8 = android.util.Log .isLoggable ( v0,v8 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
final String v10 = ", data: "; // const-string v10, ", data: "
if ( v8 != null) { // if-eqz v8, :cond_0
/* .line 26 */
try { // :try_start_1
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v11 = "Finished encoding source to cache, key: "; // const-string v11, "Finished encoding source to cache, key: "
(( java.lang.StringBuilder ) v8 ).append ( v11 ); // invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( v10 ); // invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( p1 ); // invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v11 = ", encoder: "; // const-string v11, ", encoder: "
(( java.lang.StringBuilder ) v8 ).append ( v11 ); // invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v7 = ", duration: "; // const-string v7, ", duration: "
(( java.lang.StringBuilder ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 27 */
e.b.a.e0.m .a ( v1,v2 );
/* move-result-wide v1 */
(( java.lang.StringBuilder ) v8 ).append ( v1, v2 ); // invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 28 */
android.util.Log .v ( v0,v1 );
/* .line 29 */
} // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 30 */
this.h = v6;
/* .line 31 */
/* new-instance p1, Le/b/a/y/x/h; */
v0 = this.g;
v0 = this.a;
/* .line 32 */
java.util.Collections .singletonList ( v0 );
v1 = this.b;
/* invoke-direct {p1, v0, v1, p0}, Le/b/a/y/x/h;-><init>(Ljava/util/List;Le/b/a/y/x/m;Le/b/a/y/x/k;)V */
this.e = p1;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* .line 33 */
p1 = this.g;
p1 = this.c;
} // :cond_1
int v1 = 3; // const/4 v1, 0x3
/* .line 34 */
try { // :try_start_2
v1 = android.util.Log .isLoggable ( v0,v1 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 35 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Attempt to write: "; // const-string v2, "Attempt to write: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.h;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v10 ); // invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."; // const-string p1, " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,p1 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* .line 36 */
} // :cond_2
try { // :try_start_3
p1 = this.c;
v0 = this.g;
v6 = this.a;
/* .line 37 */
v0 = this.g;
v8 = this.c;
v0 = this.g;
v0 = this.c;
/* .line 38 */
v0 = this.g;
v10 = this.a;
/* move-object v5, p1 */
/* .line 39 */
/* invoke-interface/range {v5 ..v10}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Object;Le/b/a/y/w/e;Le/b/a/y/a;Le/b/a/y/n;)V */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* :catchall_0 */
/* move-exception p1 */
/* :catchall_1 */
/* move-exception p1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-nez v3, :cond_3 */
/* .line 40 */
v0 = this.g;
v0 = this.c;
/* .line 41 */
} // :cond_3
/* throw p1 */
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 4 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw v0 */
} // .end method
public final void b ( e.b.a.y.y.v0 p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/y/v0<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.g;
v0 = this.c;
v1 = this.b;
/* .line 2 */
(( e.b.a.y.x.m ) v1 ).j ( ); // invoke-virtual {v1}, Le/b/a/y/x/m;->j()Le/b/a/n;
/* new-instance v2, Le/b/a/y/x/d1; */
/* invoke-direct {v2, p0, p1}, Le/b/a/y/x/d1;-><init>(Le/b/a/y/x/e1;Le/b/a/y/y/v0;)V */
/* .line 3 */
return;
} // .end method
public final Boolean c ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Le/b/a/y/x/e1;->d:I */
v1 = this.b;
v1 = (( e.b.a.y.x.m ) v1 ).g ( ); // invoke-virtual {v1}, Le/b/a/y/x/m;->g()Ljava/util/List;
/* if-ge v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void cancel ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.c;
} // :cond_0
return;
} // .end method
