public class inal extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum<", */
	 /* "Le/h/b/a/m/i;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final e.h.b.a.m.i d;
public static final e.h.b.a.m.i e;
public static final e.h.b.a.m.i f;
public static final e.h.b.a.m.i g;
public static final e.h.b.a.m.i h; //synthetic
/* # instance fields */
public final Integer b;
public java.lang.String c;
/* # direct methods */
public static inal ( ) {
	 /* .locals 8 */
	 /* .line 1 */
	 /* new-instance v0, Le/h/b/a/m/i; */
	 /* const v1, -0xde690d */
	 int v2 = 0; // const/4 v2, 0x0
	 final String v3 = "AVAILABLE"; // const-string v3, "AVAILABLE"
	 /* const v4, 0x7f070069 */
	 /* invoke-direct {v0, v3, v2, v4, v1}, Le/h/b/a/m/i;-><init>(Ljava/lang/String;III)V */
	 /* .line 2 */
	 /* new-instance v0, Le/h/b/a/m/i; */
	 int v3 = 1; // const/4 v3, 0x1
	 final String v4 = "ERROR"; // const-string v4, "ERROR"
	 /* const v5, 0x7f07006b */
	 /* const v6, -0xbbcca */
	 /* invoke-direct {v0, v4, v3, v5, v6}, Le/h/b/a/m/i;-><init>(Ljava/lang/String;III)V */
	 /* .line 3 */
	 /* new-instance v0, Le/h/b/a/m/i; */
	 int v4 = 2; // const/4 v4, 0x2
	 final String v5 = "OK"; // const-string v5, "OK"
	 /* const v6, 0x7f07006c */
	 /* const v7, -0xb350b0 */
	 /* invoke-direct {v0, v5, v4, v6, v7}, Le/h/b/a/m/i;-><init>(Ljava/lang/String;III)V */
	 /* .line 4 */
	 /* new-instance v0, Le/h/b/a/m/i; */
	 int v5 = 3; // const/4 v5, 0x3
	 final String v6 = "BADGING"; // const-string v6, "BADGING"
	 /* const v7, 0x7f07006a */
	 /* invoke-direct {v0, v6, v5, v7, v1}, Le/h/b/a/m/i;-><init>(Ljava/lang/String;III)V */
	 int v1 = 4; // const/4 v1, 0x4
	 /* new-array v1, v1, [Le/h/b/a/m/i; */
	 /* .line 5 */
	 v6 = e.h.b.a.m.i.d;
	 /* aput-object v6, v1, v2 */
	 v2 = e.h.b.a.m.i.e;
	 /* aput-object v2, v1, v3 */
	 v2 = e.h.b.a.m.i.f;
	 /* aput-object v2, v1, v4 */
	 /* aput-object v0, v1, v5 */
	 return;
} // .end method
public inal ( ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(II)V" */
	 /* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
/* .line 2 */
/* iput p4, p0, Le/h/b/a/m/i;->b:I */
return;
} // .end method
public static e.h.b.a.m.i valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Le/h/b/a/m/i; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Le/h/b/a/m/i; */
} // .end method
public static e.h.b.a.m.i values ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.h.b.a.m.i.h;
(( e.h.b.a.m.i ) v0 ).clone ( ); // invoke-virtual {v0}, [Le/h/b/a/m/i;->clone()Ljava/lang/Object;
/* check-cast v0, [Le/h/b/a/m/i; */
} // .end method
/* # virtual methods */
public e.h.b.a.m.i a ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 2 */
this.c = p1;
} // .end method
public java.lang.String a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public void a ( Object p0, Object p1 ) {
/* .locals 4 */
/* .line 3 */
(( e.h.b.a.m.e ) p1 ).R ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->R()Landroid/widget/ProgressBar;
/* .line 4 */
v1 = e.h.b.a.m.h.a;
v2 = (( java.lang.Enum ) p0 ).ordinal ( ); // invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I
/* aget v1, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
int v3 = 4; // const/4 v3, 0x4
/* if-eq v1, v2, :cond_1 */
int v2 = 2; // const/4 v2, 0x2
/* if-eq v1, v2, :cond_1 */
int p1 = 3; // const/4 p1, 0x3
/* if-eq v1, p1, :cond_0 */
/* .line 5 */
(( android.widget.ProgressBar ) v0 ).setVisibility ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
(( android.widget.ProgressBar ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V
/* .line 7 */
} // :cond_1
(( android.widget.ProgressBar ) v0 ).setVisibility ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V
/* .line 8 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "badge "; // const-string v1, "badge "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.h.b.a.m.d ) p2 ).f ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->f()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "TransactionState "; // const-string v1, "TransactionState "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " message "; // const-string v1, " message "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "TRANSACTIONSTATE"; // const-string v1, "TRANSACTIONSTATE"
android.util.Log .i ( v1,v0 );
/* .line 9 */
(( e.h.b.a.m.d ) p2 ).j ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->j()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 10 */
(( e.h.b.a.m.d ) p2 ).b ( v0 ); // invoke-virtual {p2, v0}, Le/h/b/a/m/d;->b(Ljava/lang/String;)V
/* .line 11 */
/* new-instance v0, Le/h/b/a/l/v0; */
(( e.h.b.a.m.e ) p1 ).J ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->J()Landroid/view/ViewGroup;
/* invoke-direct {v0, p1}, Le/h/b/a/l/v0;-><init>(Landroid/view/ViewGroup;)V */
p1 = this.c;
/* iget v1, p0, Le/h/b/a/m/i;->b:I */
(( e.h.b.a.l.v0 ) v0 ).a ( p1, v1, p2 ); // invoke-virtual {v0, p1, v1, p2}, Le/h/b/a/l/v0;->a(Ljava/lang/String;ILe/h/b/a/m/d;)V
} // :cond_2
} // :goto_0
return;
} // .end method
