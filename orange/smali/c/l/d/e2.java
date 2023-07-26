public abstract class c.l.d.e2 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.util.ArrayList a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Lc/l/d/d2;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Integer b;
public Integer c;
public Integer d;
public Integer e;
public Integer f;
public Boolean g;
public java.lang.String h;
public Integer i;
public java.lang.CharSequence j;
public Integer k;
public java.lang.CharSequence l;
public java.util.ArrayList m;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.ArrayList n;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Boolean o;
public java.util.ArrayList p;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/Runnable;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.l.d.e2 ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.a = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
/* iput-boolean p1, p0, Lc/l/d/e2;->o:Z */
return;
} // .end method
/* # virtual methods */
public abstract Integer a ( ) {
} // .end method
public c.l.d.e2 a ( Integer p0, androidx.fragment.app.Fragment p1 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* .line 7 */
(( c.l.d.e2 ) p0 ).a ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Lc/l/d/e2;->a(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V
} // .end method
public c.l.d.e2 a ( Integer p0, androidx.fragment.app.Fragment p1, java.lang.String p2 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 8 */
(( c.l.d.e2 ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lc/l/d/e2;->a(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V
} // .end method
public c.l.d.e2 a ( android.view.ViewGroup p0, androidx.fragment.app.Fragment p1, java.lang.String p2 ) {
/* .locals 0 */
/* .line 9 */
this.H = p1;
/* .line 10 */
p1 = (( android.view.ViewGroup ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I
(( c.l.d.e2 ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lc/l/d/e2;->a(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Lc/l/d/e2;
} // .end method
public c.l.d.e2 a ( androidx.fragment.app.Fragment p0 ) {
/* .locals 2 */
/* .line 24 */
/* new-instance v0, Lc/l/d/d2; */
int v1 = 3; // const/4 v1, 0x3
/* invoke-direct {v0, v1, p1}, Lc/l/d/d2;-><init>(ILandroidx/fragment/app/Fragment;)V */
(( c.l.d.e2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/l/d/e2;->a(Lc/l/d/d2;)V
} // .end method
public c.l.d.e2 a ( androidx.fragment.app.Fragment p0, c.n.g$b p1 ) {
/* .locals 2 */
/* .line 25 */
/* new-instance v0, Lc/l/d/d2; */
/* const/16 v1, 0xa */
/* invoke-direct {v0, v1, p1, p2}, Lc/l/d/d2;-><init>(ILandroidx/fragment/app/Fragment;Lc/n/g$b;)V */
(( c.l.d.e2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/l/d/e2;->a(Lc/l/d/d2;)V
} // .end method
public c.l.d.e2 a ( androidx.fragment.app.Fragment p0, java.lang.String p1 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* .line 6 */
(( c.l.d.e2 ) p0 ).a ( v0, p1, p2, v1 ); // invoke-virtual {p0, v0, p1, p2, v1}, Lc/l/d/e2;->a(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V
} // .end method
public c.l.d.e2 a ( Boolean p0 ) {
/* .locals 0 */
/* .line 26 */
/* iput-boolean p1, p0, Lc/l/d/e2;->o:Z */
} // .end method
public void a ( Integer p0, androidx.fragment.app.Fragment p1, java.lang.String p2, Integer p3 ) {
/* .locals 3 */
/* .line 11 */
(( java.lang.Object ) p2 ).getClass ( ); // invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 12 */
v1 = (( java.lang.Class ) v0 ).getModifiers ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I
/* .line 13 */
v2 = (( java.lang.Class ) v0 ).isAnonymousClass ( ); // invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z
/* if-nez v2, :cond_8 */
v2 = java.lang.reflect.Modifier .isPublic ( v1 );
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 14 */
v2 = (( java.lang.Class ) v0 ).isMemberClass ( ); // invoke-virtual {v0}, Ljava/lang/Class;->isMemberClass()Z
if ( v2 != null) { // if-eqz v2, :cond_0
v1 = java.lang.reflect.Modifier .isStatic ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_8
} // :cond_0
final String v0 = " now "; // const-string v0, " now "
final String v1 = ": was "; // const-string v1, ": was "
if ( p3 != null) { // if-eqz p3, :cond_3
/* .line 15 */
v2 = this.z;
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = (( java.lang.String ) p3 ).equals ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 16 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p4, Ljava/lang/StringBuilder; */
/* invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Can\'t change tag of fragment "; // const-string v2, "Can\'t change tag of fragment "
(( java.lang.StringBuilder ) p4 ).append ( v2 ); // invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( p2 ); // invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( v1 ); // invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p2 = this.z;
(( java.lang.StringBuilder ) p4 ).append ( p2 ); // invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( v0 ); // invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( p3 ); // invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).toString ( ); // invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 17 */
} // :cond_2
} // :goto_0
this.z = p3;
} // :cond_3
if ( p1 != null) { // if-eqz p1, :cond_7
int v2 = -1; // const/4 v2, -0x1
/* if-eq p1, v2, :cond_6 */
/* .line 18 */
/* iget p3, p2, Landroidx/fragment/app/Fragment;->x:I */
if ( p3 != null) { // if-eqz p3, :cond_5
/* if-ne p3, p1, :cond_4 */
/* .line 19 */
} // :cond_4
/* new-instance p3, Ljava/lang/IllegalStateException; */
/* new-instance p4, Ljava/lang/StringBuilder; */
/* invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Can\'t change container ID of fragment "; // const-string v2, "Can\'t change container ID of fragment "
(( java.lang.StringBuilder ) p4 ).append ( v2 ); // invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( p2 ); // invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( v1 ); // invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget p2, p2, Landroidx/fragment/app/Fragment;->x:I */
(( java.lang.StringBuilder ) p4 ).append ( p2 ); // invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( v0 ); // invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( p1 ); // invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).toString ( ); // invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p3 */
/* .line 20 */
} // :cond_5
} // :goto_1
/* iput p1, p2, Landroidx/fragment/app/Fragment;->x:I */
/* iput p1, p2, Landroidx/fragment/app/Fragment;->y:I */
/* .line 21 */
} // :cond_6
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p4, Ljava/lang/StringBuilder; */
/* invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Can\'t add fragment "; // const-string v0, "Can\'t add fragment "
(( java.lang.StringBuilder ) p4 ).append ( v0 ); // invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( p2 ); // invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p2 = " with tag "; // const-string p2, " with tag "
(( java.lang.StringBuilder ) p4 ).append ( p2 ); // invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( p3 ); // invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = " to container view with no id"; // const-string p2, " to container view with no id"
(( java.lang.StringBuilder ) p4 ).append ( p2 ); // invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).toString ( ); // invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 22 */
} // :cond_7
} // :goto_2
/* new-instance p1, Lc/l/d/d2; */
/* invoke-direct {p1, p4, p2}, Lc/l/d/d2;-><init>(ILandroidx/fragment/app/Fragment;)V */
(( c.l.d.e2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/l/d/e2;->a(Lc/l/d/d2;)V
return;
/* .line 23 */
} // :cond_8
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "Fragment "; // const-string p3, "Fragment "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Class ) v0 ).getCanonicalName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p3 = " must be a public static class to be properly recreated from instance state."; // const-string p3, " must be a public static class to be properly recreated from instance state."
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( c.l.d.d2 p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 2 */
/* iget v0, p0, Lc/l/d/e2;->b:I */
/* iput v0, p1, Lc/l/d/d2;->c:I */
/* .line 3 */
/* iget v0, p0, Lc/l/d/e2;->c:I */
/* iput v0, p1, Lc/l/d/d2;->d:I */
/* .line 4 */
/* iget v0, p0, Lc/l/d/e2;->d:I */
/* iput v0, p1, Lc/l/d/d2;->e:I */
/* .line 5 */
/* iget v0, p0, Lc/l/d/e2;->e:I */
/* iput v0, p1, Lc/l/d/d2;->f:I */
return;
} // .end method
public abstract Integer b ( ) {
} // .end method
public abstract void c ( ) {
} // .end method
public c.l.d.e2 d ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/l/d/e2;->g:Z */
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "This transaction is already being added to the back stack"; // const-string v1, "This transaction is already being added to the back stack"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
