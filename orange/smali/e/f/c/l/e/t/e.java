public class e.f.c.l.e.t.e extends e.f.c.l.e.m.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.List b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/f/c/l/e/t/g/d;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final Boolean c;
public final Float d;
public final e.f.c.l.e.t.f e; //synthetic
/* # direct methods */
public e.f.c.l.e.t.e ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/f/c/l/e/t/g/d;", */
/* ">;ZF)V" */
/* } */
} // .end annotation
/* .line 1 */
this.e = p1;
/* invoke-direct {p0}, Le/f/c/l/e/m/d;-><init>()V */
/* .line 2 */
this.b = p2;
/* .line 3 */
/* iput-boolean p3, p0, Le/f/c/l/e/t/e;->c:Z */
/* .line 4 */
/* iput p4, p0, Le/f/c/l/e/t/e;->d:F */
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 3 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
/* iget-boolean v1, p0, Le/f/c/l/e/t/e;->c:Z */
(( e.f.c.l.e.t.e ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/f/c/l/e/t/e;->a(Ljava/util/List;Z)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 2 */
e.f.c.l.e.b .a ( );
final String v2 = "An unexpected error occurred while attempting to upload crash reports."; // const-string v2, "An unexpected error occurred while attempting to upload crash reports."
/* .line 3 */
(( e.f.c.l.e.b ) v1 ).b ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
/* .line 4 */
} // :goto_0
v0 = this.e;
int v1 = 0; // const/4 v1, 0x0
e.f.c.l.e.t.f .a ( v0,v1 );
return;
} // .end method
public final void a ( java.util.List p0, Boolean p1 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/f/c/l/e/t/g/d;", */
/* ">;Z)V" */
/* } */
} // .end annotation
/* .line 5 */
e.f.c.l.e.b .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Starting report processing in "; // const-string v2, "Starting report processing in "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Le/f/c/l/e/t/e;->d:F */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v2 = " second(s)..."; // const-string v2, " second(s)..."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 6 */
/* iget v0, p0, Le/f/c/l/e/t/e;->d:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v1, v0, v1 */
/* if-lez v1, :cond_0 */
/* const/high16 v1, 0x447a0000 # 1000.0f */
/* mul-float v0, v0, v1 */
/* float-to-long v0, v0 */
/* .line 7 */
try { // :try_start_0
java.lang.Thread .sleep ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 8 */
/* :catch_0 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) p1 ).interrupt ( ); // invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
return;
/* .line 9 */
} // :cond_0
} // :goto_0
v0 = this.e;
v0 = e.f.c.l.e.t.f .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 10 */
v1 = } // :goto_1
/* if-lez v1, :cond_6 */
/* .line 11 */
v1 = this.e;
v1 = e.f.c.l.e.t.f .a ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_2
return;
/* .line 12 */
} // :cond_2
e.f.c.l.e.b .a ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Attempting to send "; // const-string v3, "Attempting to send "
v3 = (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = " report(s)"; // const-string v3, " report(s)"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 13 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 14 */
} // :cond_3
v2 = } // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_4
/* check-cast v2, Le/f/c/l/e/t/g/d; */
/* .line 15 */
v3 = this.e;
v3 = (( e.f.c.l.e.t.f ) v3 ).a ( v2, p2 ); // invoke-virtual {v3, v2, p2}, Le/f/c/l/e/t/f;->a(Le/f/c/l/e/t/g/d;Z)Z
/* if-nez v3, :cond_3 */
/* .line 16 */
(( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 17 */
p1 = } // :cond_4
/* if-lez p1, :cond_5 */
/* .line 18 */
e.f.c.l.e.t.f .a ( );
/* add-int/lit8 v2, v0, 0x1 */
e.f.c.l.e.t.f .a ( );
/* array-length v3, v3 */
/* add-int/lit8 v3, v3, -0x1 */
v0 = java.lang.Math .min ( v0,v3 );
/* aget-short p1, p1, v0 */
/* int-to-long v3, p1 */
/* .line 19 */
e.f.c.l.e.b .a ( );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Report submission: scheduling delayed retry in "; // const-string v5, "Report submission: scheduling delayed retry in "
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v5 = " seconds"; // const-string v5, " seconds"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 20 */
(( e.f.c.l.e.b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* const-wide/16 v5, 0x3e8 */
/* mul-long v3, v3, v5 */
/* .line 21 */
try { // :try_start_1
java.lang.Thread .sleep ( v3,v4 );
/* :try_end_1 */
/* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_1 */
/* move v0, v2 */
/* .line 22 */
/* :catch_1 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) p1 ).interrupt ( ); // invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
return;
} // :cond_5
} // :goto_3
/* move-object p1, v1 */
/* goto/16 :goto_1 */
} // :cond_6
return;
} // .end method
