public abstract class androidx.preference.PreferenceGroup extends androidx.preference.Preference {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.util.List v;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Landroidx/preference/Preference;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final c.e.i w;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/i<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Long;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public androidx.preference.PreferenceGroup ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 13 */
/* invoke-direct {p0, p1, p2, v0}, Landroidx/preference/PreferenceGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public androidx.preference.PreferenceGroup ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 12 */
/* invoke-direct {p0, p1, p2, p3, v0}, Landroidx/preference/PreferenceGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
return;
} // .end method
public androidx.preference.PreferenceGroup ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0, p1, p2, p3, p4}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
/* .line 2 */
/* new-instance v0, Lc/e/i; */
/* invoke-direct {v0}, Lc/e/i;-><init>()V */
this.w = v0;
/* .line 3 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
/* .line 4 */
/* new-instance v0, Landroidx/preference/PreferenceGroup$a; */
/* invoke-direct {v0, p0}, Landroidx/preference/PreferenceGroup$a;-><init>(Landroidx/preference/PreferenceGroup;)V */
/* .line 5 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.v = v0;
/* .line 6 */
v0 = c.q.f.PreferenceGroup;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0, p3, p4 ); // invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
/* .line 7 */
int p3 = 1; // const/4 p3, 0x1
/* .line 8 */
c.h.f.i.t .a ( p1,p2,p2,p3 );
/* .line 9 */
p2 = (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 10 */
/* const p3, 0x7fffffff */
p2 = c.h.f.i.t .a ( p1,p2,p2,p3 );
(( androidx.preference.PreferenceGroup ) p0 ).d ( p2 ); // invoke-virtual {p0, p2}, Landroidx/preference/PreferenceGroup;->d(I)V
/* .line 11 */
} // :cond_0
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
/* # virtual methods */
public void b ( Boolean p0 ) {
/* .locals 3 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroidx/preference/Preference;->b(Z)V */
/* .line 2 */
v0 = (( androidx.preference.PreferenceGroup ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/preference/PreferenceGroup;->q()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 3 */
(( androidx.preference.PreferenceGroup ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Landroidx/preference/PreferenceGroup;->c(I)Landroidx/preference/Preference;
(( androidx.preference.Preference ) v2 ).b ( p0, p1 ); // invoke-virtual {v2, p0, p1}, Landroidx/preference/Preference;->b(Landroidx/preference/Preference;Z)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public androidx.preference.Preference c ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.v;
/* check-cast p1, Landroidx/preference/Preference; */
} // .end method
public void d ( Integer p0 ) {
/* .locals 1 */
/* const v0, 0x7fffffff */
/* if-eq p1, v0, :cond_0 */
/* .line 1 */
p1 = (( androidx.preference.Preference ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->i()Z
/* if-nez p1, :cond_0 */
/* .line 2 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " should have a key defined if it contains an expandable preference"; // const-string v0, " should have a key defined if it contains an expandable preference"
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "PreferenceGroup"; // const-string v0, "PreferenceGroup"
android.util.Log .e ( v0,p1 );
} // :cond_0
return;
} // .end method
public Integer q ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.v;
} // .end method
