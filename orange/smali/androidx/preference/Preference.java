public class androidx.preference.Preference implements java.lang.Comparable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/preference/Preference$b;, */
	 /* Landroidx/preference/Preference$d;, */
	 /* Landroidx/preference/Preference$c; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Comparable<", */
/* "Landroidx/preference/Preference;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
public android.content.Context b;
public c.q.b c;
public c.q.a d;
public androidx.preference.Preference$c e;
public androidx.preference.Preference$d f;
public Integer g;
public java.lang.CharSequence h;
public java.lang.CharSequence i;
public java.lang.String j;
public android.content.Intent k;
public java.lang.String l;
public Boolean m;
public Boolean n;
public Boolean o;
public java.lang.Object p;
public Boolean q;
public Boolean r;
public Boolean s;
public androidx.preference.Preference$b t;
public java.util.List u;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Landroidx/preference/Preference;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public androidx.preference.Preference ( ) {
/* .locals 2 */
/* .line 37 */
/* const v1, 0x101008e */
v0 = c.h.f.i.t .a ( p1,v0,v1 );
/* invoke-direct {p0, p1, p2, v0}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public androidx.preference.Preference ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 36 */
/* invoke-direct {p0, p1, p2, p3, v0}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
return;
} // .end method
public androidx.preference.Preference ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* const v0, 0x7fffffff */
/* .line 2 */
/* iput v0, p0, Landroidx/preference/Preference;->g:I */
int v1 = 1; // const/4 v1, 0x1
/* .line 3 */
/* iput-boolean v1, p0, Landroidx/preference/Preference;->m:Z */
/* .line 4 */
/* iput-boolean v1, p0, Landroidx/preference/Preference;->n:Z */
/* .line 5 */
/* iput-boolean v1, p0, Landroidx/preference/Preference;->o:Z */
/* .line 6 */
/* iput-boolean v1, p0, Landroidx/preference/Preference;->q:Z */
/* .line 7 */
/* iput-boolean v1, p0, Landroidx/preference/Preference;->r:Z */
/* .line 8 */
/* new-instance v2, Landroidx/preference/Preference$a; */
/* invoke-direct {v2, p0}, Landroidx/preference/Preference$a;-><init>(Landroidx/preference/Preference;)V */
/* .line 9 */
this.b = p1;
/* .line 10 */
v2 = c.q.f.Preference;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v2, p3, p4 ); // invoke-virtual {p1, p2, v2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
/* .line 11 */
int p4 = 0; // const/4 p4, 0x0
c.h.f.i.t .b ( p1,p2,p3,p4 );
/* .line 12 */
c.h.f.i.t .b ( p1,p2,p3 );
this.j = p2;
/* .line 13 */
c.h.f.i.t .c ( p1,p2,p3 );
this.h = p2;
/* .line 14 */
c.h.f.i.t .c ( p1,p2,p3 );
this.i = p2;
/* .line 15 */
p2 = c.h.f.i.t .a ( p1,p2,p3,v0 );
/* iput p2, p0, Landroidx/preference/Preference;->g:I */
/* .line 16 */
c.h.f.i.t .b ( p1,p2,p3 );
this.l = p2;
/* .line 17 */
c.h.f.i.t .b ( p1,p2,p3,v0 );
/* .line 18 */
c.h.f.i.t .b ( p1,p2,p3,p4 );
/* .line 19 */
p2 = c.h.f.i.t .a ( p1,p2,p3,v1 );
/* iput-boolean p2, p0, Landroidx/preference/Preference;->m:Z */
/* .line 20 */
p2 = c.h.f.i.t .a ( p1,p2,p3,v1 );
/* iput-boolean p2, p0, Landroidx/preference/Preference;->n:Z */
/* .line 21 */
p2 = c.h.f.i.t .a ( p1,p2,p3,v1 );
/* iput-boolean p2, p0, Landroidx/preference/Preference;->o:Z */
/* .line 22 */
c.h.f.i.t .b ( p1,p2,p3 );
/* .line 23 */
/* iget-boolean p3, p0, Landroidx/preference/Preference;->n:Z */
c.h.f.i.t .a ( p1,p2,p2,p3 );
/* .line 24 */
/* iget-boolean p3, p0, Landroidx/preference/Preference;->n:Z */
c.h.f.i.t .a ( p1,p2,p2,p3 );
/* .line 25 */
p2 = (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 26 */
(( androidx.preference.Preference ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/preference/Preference;->a(Landroid/content/res/TypedArray;I)Ljava/lang/Object;
this.p = p2;
/* .line 27 */
} // :cond_0
p2 = (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 28 */
(( androidx.preference.Preference ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/preference/Preference;->a(Landroid/content/res/TypedArray;I)Ljava/lang/Object;
this.p = p2;
/* .line 29 */
} // :cond_1
} // :goto_0
/* .line 30 */
c.h.f.i.t .a ( p1,p2,p3,v1 );
/* .line 31 */
p2 = (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
/* iput-boolean p2, p0, Landroidx/preference/Preference;->s:Z */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 32 */
c.h.f.i.t .a ( p1,p2,p3,v1 );
/* .line 33 */
} // :cond_2
c.h.f.i.t .a ( p1,p2,p3,p4 );
/* .line 34 */
c.h.f.i.t .a ( p1,p2,p2,v1 );
/* .line 35 */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
/* # virtual methods */
public Integer a ( Integer p0 ) {
/* .locals 2 */
/* .line 17 */
v0 = (( androidx.preference.Preference ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->p()Z
/* if-nez v0, :cond_0 */
/* .line 18 */
} // :cond_0
(( androidx.preference.Preference ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->e()Lc/q/a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 19 */
v1 = this.j;
p1 = (( c.q.a ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lc/q/a;->a(Ljava/lang/String;I)I
/* .line 20 */
} // :cond_1
v0 = this.c;
(( c.q.b ) v0 ).e ( ); // invoke-virtual {v0}, Lc/q/b;->e()Landroid/content/SharedPreferences;
p1 = v1 = this.j;
} // .end method
public Integer a ( androidx.preference.Preference p0 ) {
/* .locals 2 */
/* .line 4 */
/* iget v0, p0, Landroidx/preference/Preference;->g:I */
/* iget v1, p1, Landroidx/preference/Preference;->g:I */
/* if-eq v0, v1, :cond_0 */
/* sub-int/2addr v0, v1 */
/* .line 5 */
} // :cond_0
v0 = this.h;
v1 = this.h;
/* if-ne v0, v1, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
/* if-nez v0, :cond_2 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
/* if-nez v1, :cond_3 */
int p1 = -1; // const/4 p1, -0x1
/* .line 6 */
} // :cond_3
p1 = this.h;
p1 = (( java.lang.String ) v0 ).compareToIgnoreCase ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I
} // .end method
public android.content.Context a ( ) {
/* .locals 1 */
/* .line 3 */
v0 = this.b;
} // .end method
public java.lang.Object a ( android.content.res.TypedArray p0, Integer p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.String a ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 13 */
v0 = (( androidx.preference.Preference ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->p()Z
/* if-nez v0, :cond_0 */
/* .line 14 */
} // :cond_0
(( androidx.preference.Preference ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->e()Lc/q/a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 15 */
v1 = this.j;
(( c.q.a ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lc/q/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 16 */
} // :cond_1
v0 = this.c;
(( c.q.b ) v0 ).e ( ); // invoke-virtual {v0}, Lc/q/b;->e()Landroid/content/SharedPreferences;
v1 = this.j;
} // .end method
public final void a ( android.content.SharedPreferences$Editor p0 ) {
/* .locals 1 */
/* .line 11 */
v0 = this.c;
v0 = (( c.q.b ) v0 ).f ( ); // invoke-virtual {v0}, Lc/q/b;->f()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 12 */
} // :cond_0
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 0 */
/* .line 2 */
(( androidx.preference.Preference ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->n()V
return;
} // .end method
public void a ( androidx.preference.Preference p0, Boolean p1 ) {
/* .locals 0 */
/* .line 7 */
/* iget-boolean p1, p0, Landroidx/preference/Preference;->q:Z */
/* if-ne p1, p2, :cond_0 */
/* xor-int/lit8 p1, p2, 0x1 */
/* .line 8 */
/* iput-boolean p1, p0, Landroidx/preference/Preference;->q:Z */
/* .line 9 */
p1 = (( androidx.preference.Preference ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->o()Z
(( androidx.preference.Preference ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/preference/Preference;->b(Z)V
/* .line 10 */
(( androidx.preference.Preference ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->l()V
} // :cond_0
return;
} // .end method
public Boolean a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
p1 = if ( v0 != null) { // if-eqz v0, :cond_1
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public Boolean a ( Boolean p0 ) {
/* .locals 2 */
/* .line 21 */
v0 = (( androidx.preference.Preference ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->p()Z
/* if-nez v0, :cond_0 */
/* .line 22 */
} // :cond_0
(( androidx.preference.Preference ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->e()Lc/q/a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 23 */
v1 = this.j;
p1 = (( c.q.a ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lc/q/a;->a(Ljava/lang/String;Z)Z
/* .line 24 */
} // :cond_1
v0 = this.c;
(( c.q.b ) v0 ).e ( ); // invoke-virtual {v0}, Lc/q/b;->e()Landroid/content/SharedPreferences;
p1 = v1 = this.j;
} // .end method
public java.lang.StringBuilder b ( ) {
/* .locals 4 */
/* .line 22 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 23 */
(( androidx.preference.Preference ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->h()Ljava/lang/CharSequence;
/* .line 24 */
v2 = android.text.TextUtils .isEmpty ( v1 );
/* const/16 v3, 0x20 */
/* if-nez v2, :cond_0 */
/* .line 25 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 26 */
} // :cond_0
(( androidx.preference.Preference ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->g()Ljava/lang/CharSequence;
/* .line 27 */
v2 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v2, :cond_1 */
/* .line 28 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 29 */
} // :cond_1
v1 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
/* if-lez v1, :cond_2 */
/* .line 30 */
v1 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
/* add-int/lit8 v1, v1, -0x1 */
(( java.lang.StringBuilder ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V
} // :cond_2
} // .end method
public void b ( androidx.preference.Preference p0, Boolean p1 ) {
/* .locals 0 */
/* .line 4 */
/* iget-boolean p1, p0, Landroidx/preference/Preference;->r:Z */
/* if-ne p1, p2, :cond_0 */
/* xor-int/lit8 p1, p2, 0x1 */
/* .line 5 */
/* iput-boolean p1, p0, Landroidx/preference/Preference;->r:Z */
/* .line 6 */
p1 = (( androidx.preference.Preference ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->o()Z
(( androidx.preference.Preference ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/preference/Preference;->b(Z)V
/* .line 7 */
(( androidx.preference.Preference ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->l()V
} // :cond_0
return;
} // .end method
public void b ( Boolean p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.u;
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
v1 = } // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* .line 3 */
/* check-cast v3, Landroidx/preference/Preference; */
(( androidx.preference.Preference ) v3 ).a ( p0, p1 ); // invoke-virtual {v3, p0, p1}, Landroidx/preference/Preference;->a(Landroidx/preference/Preference;Z)V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
return;
} // .end method
public Boolean b ( Integer p0 ) {
/* .locals 3 */
/* .line 15 */
v0 = (( androidx.preference.Preference ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->p()Z
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
/* not-int v0, p1 */
/* .line 16 */
v0 = (( androidx.preference.Preference ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/preference/Preference;->a(I)I
int v1 = 1; // const/4 v1, 0x1
/* if-ne p1, v0, :cond_1 */
/* .line 17 */
} // :cond_1
(( androidx.preference.Preference ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->e()Lc/q/a;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 18 */
v2 = this.j;
(( c.q.a ) v0 ).b ( v2, p1 ); // invoke-virtual {v0, v2, p1}, Lc/q/a;->b(Ljava/lang/String;I)V
/* .line 19 */
} // :cond_2
v0 = this.c;
(( c.q.b ) v0 ).a ( ); // invoke-virtual {v0}, Lc/q/b;->a()Landroid/content/SharedPreferences$Editor;
/* .line 20 */
v2 = this.j;
/* .line 21 */
(( androidx.preference.Preference ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/preference/Preference;->a(Landroid/content/SharedPreferences$Editor;)V
} // :goto_0
} // .end method
public Boolean b ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 8 */
v0 = (( androidx.preference.Preference ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->p()Z
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
(( androidx.preference.Preference ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/preference/Preference;->a(Ljava/lang/String;)Ljava/lang/String;
v0 = android.text.TextUtils .equals ( p1,v0 );
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 10 */
} // :cond_1
(( androidx.preference.Preference ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->e()Lc/q/a;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 11 */
v2 = this.j;
(( c.q.a ) v0 ).b ( v2, p1 ); // invoke-virtual {v0, v2, p1}, Lc/q/a;->b(Ljava/lang/String;Ljava/lang/String;)V
/* .line 12 */
} // :cond_2
v0 = this.c;
(( c.q.b ) v0 ).a ( ); // invoke-virtual {v0}, Lc/q/b;->a()Landroid/content/SharedPreferences$Editor;
/* .line 13 */
v2 = this.j;
/* .line 14 */
(( androidx.preference.Preference ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/preference/Preference;->a(Landroid/content/SharedPreferences$Editor;)V
} // :goto_0
} // .end method
public java.lang.String c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.l;
} // .end method
public Boolean c ( Boolean p0 ) {
/* .locals 3 */
/* .line 2 */
v0 = (( androidx.preference.Preference ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->p()Z
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
/* xor-int/lit8 v0, p1, 0x1 */
/* .line 3 */
v0 = (( androidx.preference.Preference ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/preference/Preference;->a(Z)Z
int v1 = 1; // const/4 v1, 0x1
/* if-ne p1, v0, :cond_1 */
/* .line 4 */
} // :cond_1
(( androidx.preference.Preference ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->e()Lc/q/a;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 5 */
v2 = this.j;
(( c.q.a ) v0 ).b ( v2, p1 ); // invoke-virtual {v0, v2, p1}, Lc/q/a;->b(Ljava/lang/String;Z)V
/* .line 6 */
} // :cond_2
v0 = this.c;
(( c.q.b ) v0 ).a ( ); // invoke-virtual {v0}, Lc/q/b;->a()Landroid/content/SharedPreferences$Editor;
/* .line 7 */
v2 = this.j;
/* .line 8 */
(( androidx.preference.Preference ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/preference/Preference;->a(Landroid/content/SharedPreferences$Editor;)V
} // :goto_0
} // .end method
public Integer compareTo ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Landroidx/preference/Preference; */
p1 = (( androidx.preference.Preference ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/preference/Preference;->a(Landroidx/preference/Preference;)I
} // .end method
public android.content.Intent d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k;
} // .end method
public c.q.a e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
(( c.q.b ) v0 ).d ( ); // invoke-virtual {v0}, Lc/q/b;->d()Lc/q/a;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public c.q.b f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public java.lang.CharSequence g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
} // .end method
public java.lang.CharSequence h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
} // .end method
public Boolean i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* xor-int/lit8 v0, v0, 0x1 */
} // .end method
public Boolean j ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/preference/Preference;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Landroidx/preference/Preference;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Landroidx/preference/Preference;->r:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean k ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/preference/Preference;->o:Z */
} // .end method
public void l ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
return;
} // .end method
public void m ( ) {
/* .locals 0 */
return;
} // .end method
public void n ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( androidx.preference.Preference ) p0 ).j ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->j()Z
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
(( androidx.preference.Preference ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->m()V
/* .line 3 */
v0 = this.f;
v0 = if ( v0 != null) { // if-eqz v0, :cond_1
if ( v0 != null) { // if-eqz v0, :cond_1
return;
/* .line 4 */
} // :cond_1
(( androidx.preference.Preference ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->f()Lc/q/b;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 5 */
(( c.q.b ) v0 ).c ( ); // invoke-virtual {v0}, Lc/q/b;->c()Lc/q/b$b;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = /* .line 6 */
if ( v0 != null) { // if-eqz v0, :cond_2
return;
/* .line 7 */
} // :cond_2
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 8 */
(( androidx.preference.Preference ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->a()Landroid/content/Context;
/* .line 9 */
v1 = this.k;
(( android.content.Context ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
} // :cond_3
return;
} // .end method
public Boolean o ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( androidx.preference.Preference ) p0 ).j ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->j()Z
/* xor-int/lit8 v0, v0, 0x1 */
} // .end method
public Boolean p ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( androidx.preference.Preference ) p0 ).k ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->k()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( androidx.preference.Preference ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->i()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.preference.Preference ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->b()Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
