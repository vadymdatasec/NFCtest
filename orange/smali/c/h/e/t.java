public class c.h.e.t {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.os.Bundle a;
	 public androidx.core.graphics.drawable.IconCompat b;
	 public final c.h.e.h0 c;
	 public final c.h.e.h0 d;
	 public Boolean e;
	 public Boolean f;
	 public final Integer g;
	 public final Boolean h;
	 public Integer i;
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
} // .end field
public java.lang.CharSequence j;
public android.app.PendingIntent k;
/* # direct methods */
public c.h.e.t ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
} // :cond_0
final String v1 = ""; // const-string v1, ""
/* .line 1 */
androidx.core.graphics.drawable.IconCompat .a ( v0,v1,p1 );
} // :goto_0
/* invoke-direct {p0, v0, p2, p3}, Lc/h/e/t;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V */
return;
} // .end method
public c.h.e.t ( ) {
/* .locals 11 */
/* .line 2 */
/* new-instance v4, Landroid/os/Bundle; */
/* invoke-direct {v4}, Landroid/os/Bundle;-><init>()V */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
int v7 = 1; // const/4 v7, 0x1
int v8 = 0; // const/4 v8, 0x0
int v9 = 1; // const/4 v9, 0x1
int v10 = 0; // const/4 v10, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* invoke-direct/range {v0 ..v10}, Lc/h/e/t;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Lc/h/e/h0;[Lc/h/e/h0;ZIZZ)V */
return;
} // .end method
public c.h.e.t ( ) {
/* .locals 2 */
/* .line 3 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
/* iput-boolean v0, p0, Lc/h/e/t;->f:Z */
/* .line 5 */
this.b = p1;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 6 */
v0 = (( androidx.core.graphics.drawable.IconCompat ) p1 ).d ( ); // invoke-virtual {p1}, Landroidx/core/graphics/drawable/IconCompat;->d()I
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_0 */
/* .line 7 */
p1 = (( androidx.core.graphics.drawable.IconCompat ) p1 ).b ( ); // invoke-virtual {p1}, Landroidx/core/graphics/drawable/IconCompat;->b()I
/* iput p1, p0, Lc/h/e/t;->i:I */
/* .line 8 */
} // :cond_0
c.h.e.c0$a .d ( p2 );
this.j = p1;
/* .line 9 */
this.k = p3;
if ( p4 != null) { // if-eqz p4, :cond_1
/* .line 10 */
} // :cond_1
/* new-instance p4, Landroid/os/Bundle; */
/* invoke-direct {p4}, Landroid/os/Bundle;-><init>()V */
} // :goto_0
this.a = p4;
/* .line 11 */
this.c = p5;
/* .line 12 */
this.d = p6;
/* .line 13 */
/* iput-boolean p7, p0, Lc/h/e/t;->e:Z */
/* .line 14 */
/* iput p8, p0, Lc/h/e/t;->g:I */
/* .line 15 */
/* iput-boolean p9, p0, Lc/h/e/t;->f:Z */
/* .line 16 */
/* iput-boolean p10, p0, Lc/h/e/t;->h:Z */
return;
} // .end method
/* # virtual methods */
public android.app.PendingIntent a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/h/e/t;->e:Z */
} // .end method
public c.h.e.h0 c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.os.Bundle d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public androidx.core.graphics.drawable.IconCompat e ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lc/h/e/t;->i:I */
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
final String v2 = ""; // const-string v2, ""
/* .line 2 */
androidx.core.graphics.drawable.IconCompat .a ( v1,v2,v0 );
this.b = v0;
/* .line 3 */
} // :cond_0
v0 = this.b;
} // .end method
public c.h.e.h0 f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public Integer g ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/h/e/t;->g:I */
} // .end method
public Boolean h ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/h/e/t;->f:Z */
} // .end method
public java.lang.CharSequence i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
} // .end method
public Boolean j ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/h/e/t;->h:Z */
} // .end method
