public class e.h.b.a.l.y0 extends androidx.recyclerview.widget.RecyclerView$g {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Le/h/b/a/l/y0$a; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroidx/recyclerview/widget/RecyclerView$g<", */
/* "Landroidx/recyclerview/widget/RecyclerView$d0;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
public android.content.Context c;
public java.util.List d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/h/b/a/m/d;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.List e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/h/b/a/m/d;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.List f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/h/b/a/m/d;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final e.h.b.a.l.y0$a g;
public java.util.concurrent.ConcurrentHashMap h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/ConcurrentHashMap<", */
/* "Le/h/b/a/m/d;", */
/* "Ljava/util/Timer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final android.os.Handler i;
public Boolean j;
public Boolean k;
public Boolean l;
public Boolean m;
/* # direct methods */
public e.h.b.a.l.y0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
this.h = v0;
/* .line 3 */
this.c = p1;
/* .line 4 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.d = v0;
/* .line 5 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.e = v0;
/* .line 6 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.f = v0;
/* .line 7 */
/* instance-of v0, p1, Le/h/b/a/l/y0$a; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
/* move-object v0, p1 */
/* check-cast v0, Le/h/b/a/l/y0$a; */
this.g = v0;
/* .line 9 */
/* new-instance v0, Landroid/os/Handler; */
(( android.content.Context ) p1 ).getMainLooper ( ); // invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
/* invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
this.i = v0;
return;
/* .line 10 */
} // :cond_0
/* new-instance p1, Lcom/orange/hce/proto/util/PackIdRuntimeException; */
final String v0 = "Context must implement the BadgeRecyclerViewAdapter.OnListInteractionListener"; // const-string v0, "Context must implement the BadgeRecyclerViewAdapter.OnListInteractionListener"
/* invoke-direct {p1, v0}, Lcom/orange/hce/proto/util/PackIdRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public static void a ( e.h.b.a.l.y0 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( e.h.b.a.l.y0 ) p0 ).d ( ); // invoke-virtual {p0}, Le/h/b/a/l/y0;->d()V
return;
} // .end method
public static Boolean a ( android.content.Context p0, Object p1 ) {
/* .locals 2 */
/* .line 74 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( e.h.b.a.m.d ) p1 ).d ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.h.b.a.m.d ) p1 ).a ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) p1 ).toHexa ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v0 = 0; // const/4 v0, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
final String p1 = "isFavorite"; // const-string p1, "isFavorite"
p0 = /* .line 75 */
} // .end method
/* # virtual methods */
public Integer a ( ) {
/* .locals 1 */
/* .line 2 */
v0 = v0 = this.f;
} // .end method
public final e.h.b.a.m.d a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 3 */
/* .line 93 */
v0 = this.f;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Le/h/b/a/m/d; */
/* .line 94 */
v2 = (( e.h.b.a.l.y0 ) p0 ).a ( p1, p2, v1 ); // invoke-virtual {p0, p1, p2, v1}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Le/h/b/a/m/d;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final java.util.List a ( Object p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/h/b/a/m/d;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Le/h/b/a/m/d;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 76 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 77 */
v1 = this.e;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Le/h/b/a/m/d; */
/* .line 78 */
v3 = (( e.h.b.a.l.y0 ) p0 ).b ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Le/h/b/a/l/y0;->b(Le/h/b/a/m/d;Le/h/b/a/m/d;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 79 */
} // :cond_1
} // .end method
public java.util.List a ( java.util.List p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/h/b/a/m/d;", */
/* ">;)", */
/* "Ljava/util/List<", */
/* "Le/h/b/a/m/d;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 80 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 81 */
v1 = this.f;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Le/h/b/a/m/d; */
v3 = /* .line 82 */
/* if-nez v3, :cond_0 */
/* .line 83 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "delete:"; // const-string v4, "delete:"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v4 = "packid.badgeAdapter"; // const-string v4, "packid.badgeAdapter"
android.util.Log .i ( v4,v3 );
/* .line 84 */
} // :cond_1
} // .end method
public void a ( android.content.SharedPreferences p0, android.view.View p1 ) { //synthethic
/* .locals 1 */
/* .line 61 */
/* check-cast p2, Lcom/orange/hce/proto/activity/StateImageButton; */
(( com.orange.hce.proto.activity.StateImageButton ) p2 ).getActive ( ); // invoke-virtual {p2}, Lcom/orange/hce/proto/activity/StateImageButton;->getActive()Ljava/lang/Boolean;
p2 = (( java.lang.Boolean ) p2 ).booleanValue ( ); // invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
final String v0 = "isFavorite"; // const-string v0, "isFavorite"
/* .line 62 */
(( e.h.b.a.l.y0 ) p0 ).e ( ); // invoke-virtual {p0}, Le/h/b/a/l/y0;->e()V
return;
} // .end method
public void a ( android.os.Vibrator p0, Object p1, android.view.View p2 ) { //synthethic
/* .locals 2 */
/* const-wide/16 v0, 0x96 */
/* .line 51 */
(( android.os.Vibrator ) p1 ).vibrate ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/Vibrator;->vibrate(J)V
/* .line 52 */
/* new-instance p1, Lcom/orange/business/packid/android/lib/PackId; */
p3 = this.c;
/* invoke-direct {p1, p3}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( e.h.b.a.m.d ) p2 ).d ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
(( e.h.b.a.m.d ) p2 ).a ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
(( com.orange.business.packid.android.lib.PackId ) p1 ).startBleTransaction ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Lcom/orange/business/packid/android/lib/PackId;->startBleTransaction(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
/* .line 53 */
p1 = e.h.b.a.m.i.g;
/* const/16 p3, 0x2710 */
(( e.h.b.a.l.y0 ) p0 ).a ( p2, p1, p3 ); // invoke-virtual {p0, p2, p1, p3}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V
return;
} // .end method
public final void a ( android.view.View p0 ) {
/* .locals 3 */
/* .line 85 */
p1 = this.c;
/* new-instance v0, Landroid/content/Intent; */
v1 = this.c;
/* const-class v2, Lcom/orange/hce/proto/activity/PermissionsActivity; */
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
(( android.content.Context ) p1 ).startActivity ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
return;
} // .end method
public final void a ( androidx.constraintlayout.widget.ConstraintLayout p0, Integer p1 ) {
/* .locals 5 */
/* const v0, 0x7f080194 */
/* .line 23 */
(( android.view.ViewGroup ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* .line 24 */
/* new-instance v1, Lc/f/b/f; */
/* invoke-direct {v1}, Lc/f/b/f;-><init>()V */
/* .line 25 */
(( c.f.b.f ) v1 ).c ( p1 ); // invoke-virtual {v1, p1}, Lc/f/b/f;->c(Landroidx/constraintlayout/widget/ConstraintLayout;)V
/* .line 26 */
v2 = (( android.view.View ) v0 ).getId ( ); // invoke-virtual {v0}, Landroid/view/View;->getId()I
int v3 = 3; // const/4 v3, 0x3
int v4 = 0; // const/4 v4, 0x0
(( c.f.b.f ) v1 ).a ( v2, v3, v4, v3 ); // invoke-virtual {v1, v2, v3, v4, v3}, Lc/f/b/f;->a(IIII)V
/* .line 27 */
v0 = (( android.view.View ) v0 ).getId ( ); // invoke-virtual {v0}, Landroid/view/View;->getId()I
int v2 = 4; // const/4 v2, 0x4
(( c.f.b.f ) v1 ).a ( v0, v2, p2, v2 ); // invoke-virtual {v1, v0, v2, p2, v2}, Lc/f/b/f;->a(IIII)V
/* .line 28 */
(( c.f.b.f ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lc/f/b/f;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V
return;
} // .end method
public final void a ( androidx.recyclerview.widget.RecyclerView$d0 p0, Object p1 ) {
/* .locals 4 */
/* .line 3 */
/* move-object v0, p1 */
/* check-cast v0, Le/h/b/a/m/e; */
/* .line 4 */
(( e.h.b.a.m.e ) v0 ).S ( ); // invoke-virtual {v0}, Le/h/b/a/m/e;->S()V
/* .line 5 */
(( e.h.b.a.l.y0 ) p0 ).b ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Le/h/b/a/l/y0;->b(Le/h/b/a/m/e;Le/h/b/a/m/d;)V
/* .line 6 */
(( e.h.b.a.m.e ) v0 ).H ( ); // invoke-virtual {v0}, Le/h/b/a/m/e;->H()Landroid/widget/TextView;
(( e.h.b.a.m.d ) p2 ).f ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->f()Ljava/lang/String;
(( android.widget.TextView ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 7 */
(( e.h.b.a.m.e ) v0 ).Q ( ); // invoke-virtual {v0}, Le/h/b/a/m/e;->Q()Landroid/widget/TextView;
(( e.h.b.a.m.d ) p2 ).a ( v1 ); // invoke-virtual {p2, v1}, Le/h/b/a/m/d;->a(Landroid/widget/TextView;)V
/* .line 8 */
(( e.h.b.a.m.e ) v0 ).F ( ); // invoke-virtual {v0}, Le/h/b/a/m/e;->F()Landroid/widget/TextView;
(( e.h.b.a.m.d ) p2 ).c ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->c()Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;
v3 = com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction.none;
v2 = (( java.lang.Enum ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
int v3 = 0; // const/4 v3, 0x0
if ( v2 != null) { // if-eqz v2, :cond_0
/* const/16 v2, 0x8 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
(( android.widget.TextView ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 9 */
(( e.h.b.a.m.e ) v0 ).D ( ); // invoke-virtual {v0}, Le/h/b/a/m/e;->D()Landroid/widget/TextView;
(( e.h.b.a.m.d ) p2 ).i ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->i()Ljava/lang/String;
(( android.widget.TextView ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 10 */
(( e.h.b.a.m.e ) v0 ).E ( ); // invoke-virtual {v0}, Le/h/b/a/m/e;->E()Landroid/widget/ImageView;
(( e.h.b.a.m.d ) p2 ).d ( v1 ); // invoke-virtual {p2, v1}, Le/h/b/a/m/d;->d(Landroid/widget/ImageView;)V
/* .line 11 */
(( e.h.b.a.m.e ) v0 ).E ( ); // invoke-virtual {v0}, Le/h/b/a/m/e;->E()Landroid/widget/ImageView;
(( android.widget.ImageView ) v1 ).setVisibility ( v3 ); // invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 12 */
(( e.h.b.a.m.e ) v0 ).K ( ); // invoke-virtual {v0}, Le/h/b/a/m/e;->K()Landroid/widget/ImageButton;
/* new-instance v2, Le/h/b/a/l/u; */
/* invoke-direct {v2, p0, p2}, Le/h/b/a/l/u;-><init>(Le/h/b/a/l/y0;Le/h/b/a/m/d;)V */
(( android.widget.ImageButton ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 13 */
(( e.h.b.a.l.y0 ) p0 ).e ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Le/h/b/a/l/y0;->e(Le/h/b/a/m/e;Le/h/b/a/m/d;)V
/* .line 14 */
(( e.h.b.a.l.y0 ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/e;Le/h/b/a/m/d;)V
/* .line 15 */
(( e.h.b.a.l.y0 ) p0 ).c ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/e;Le/h/b/a/m/d;)V
/* .line 16 */
(( e.h.b.a.l.y0 ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Le/h/b/a/m/e;)V
/* .line 17 */
(( e.h.b.a.m.e ) v0 ).C ( ); // invoke-virtual {v0}, Le/h/b/a/m/e;->C()Landroid/view/View;
int v2 = 1; // const/4 v2, 0x1
(( android.view.View ) v1 ).setActivated ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->setActivated(Z)V
/* .line 18 */
(( e.h.b.a.l.y0 ) p0 ).b ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Le/h/b/a/l/y0;->b(Le/h/b/a/m/d;Le/h/b/a/m/e;)V
/* .line 19 */
p2 = (( e.h.b.a.m.d ) p2 ).v ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->v()Z
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 20 */
p1 = this.a;
/* check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout; */
/* const p2, 0x7f0800ad */
(( e.h.b.a.l.y0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/b/a/l/y0;->a(Landroidx/constraintlayout/widget/ConstraintLayout;I)V
/* .line 21 */
} // :cond_1
p1 = this.a;
/* check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout; */
(( e.h.b.a.l.y0 ) p0 ).a ( p1, v3 ); // invoke-virtual {p0, p1, v3}, Le/h/b/a/l/y0;->a(Landroidx/constraintlayout/widget/ConstraintLayout;I)V
} // :goto_1
return;
} // .end method
public void a ( com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType p0, fr.mbs.binary.Octets p1, fr.mbs.binary.Octets p2, java.lang.String p3, java.lang.Integer p4, java.lang.String p5 ) {
/* .locals 2 */
/* .line 95 */
(( e.h.b.a.l.y0 ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/m/d;
/* if-nez p2, :cond_0 */
return;
/* .line 96 */
} // :cond_0
p3 = p3 = this.f;
/* .line 97 */
(( e.h.b.a.m.d ) p2 ).p ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->p()Le/h/b/a/m/i;
/* .line 98 */
v1 = e.h.b.a.l.x0.a;
p1 = (( java.lang.Enum ) p1 ).ordinal ( ); // invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I
/* aget p1, v1, p1 */
int v1 = 1; // const/4 v1, 0x1
/* if-eq p1, v1, :cond_3 */
int p5 = 2; // const/4 p5, 0x2
/* const/16 v1, 0xbb8 */
/* if-eq p1, p5, :cond_2 */
int p4 = 3; // const/4 p4, 0x3
/* if-eq p1, p4, :cond_1 */
int p4 = 4; // const/4 p4, 0x4
/* if-eq p1, p4, :cond_1 */
int p4 = 5; // const/4 p4, 0x5
/* if-eq p1, p4, :cond_1 */
/* .line 99 */
} // :cond_1
(( e.h.b.a.m.d ) p2 ).b ( p6 ); // invoke-virtual {p2, p6}, Le/h/b/a/m/d;->b(Ljava/lang/String;)V
/* .line 100 */
p1 = e.h.b.a.m.i.e;
(( e.h.b.a.m.i ) p1 ).a ( p6 ); // invoke-virtual {p1, p6}, Le/h/b/a/m/i;->a(Ljava/lang/String;)Le/h/b/a/m/i;
(( e.h.b.a.l.y0 ) p0 ).a ( p2, p1, v1 ); // invoke-virtual {p0, p2, p1, v1}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V
/* .line 101 */
} // :cond_2
(( e.h.b.a.m.d ) p2 ).b ( p6 ); // invoke-virtual {p2, p6}, Le/h/b/a/m/d;->b(Ljava/lang/String;)V
/* .line 102 */
p1 = e.h.b.a.m.i.f;
(( e.h.b.a.m.i ) p1 ).a ( p6 ); // invoke-virtual {p1, p6}, Le/h/b/a/m/i;->a(Ljava/lang/String;)Le/h/b/a/m/i;
(( e.h.b.a.l.y0 ) p0 ).a ( p2, p1, v1 ); // invoke-virtual {p0, p2, p1, v1}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V
/* .line 103 */
(( e.h.b.a.l.y0 ) p0 ).a ( p4, p2 ); // invoke-virtual {p0, p4, p2}, Le/h/b/a/l/y0;->a(Ljava/lang/String;Le/h/b/a/m/d;)V
/* .line 104 */
} // :cond_3
p1 = e.h.b.a.m.i.g;
p4 = (( java.lang.Integer ) p5 ).intValue ( ); // invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I
/* add-int/lit16 p4, p4, 0x3e8 */
(( e.h.b.a.l.y0 ) p0 ).a ( p2, p1, p4 ); // invoke-virtual {p0, p2, p1, p4}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V
/* .line 105 */
} // :goto_0
(( e.h.b.a.m.d ) p2 ).p ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->p()Le/h/b/a/m/i;
/* if-eq v0, p1, :cond_4 */
/* .line 106 */
(( androidx.recyclerview.widget.RecyclerView$g ) p0 ).a ( p3, p2 ); // invoke-virtual {p0, p3, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->a(ILjava/lang/Object;)V
} // :cond_4
return;
} // .end method
public void a ( Object p0, android.view.View p1 ) { //synthethic
/* .locals 0 */
/* .line 22 */
p2 = this.g;
return;
} // .end method
public void a ( Object p0, android.view.View p1, android.view.View p2 ) { //synthethic
/* .locals 0 */
/* .line 49 */
/* check-cast p3, Lcom/orange/hce/proto/activity/StateImageButton; */
(( com.orange.hce.proto.activity.StateImageButton ) p3 ).getActive ( ); // invoke-virtual {p3}, Lcom/orange/hce/proto/activity/StateImageButton;->getActive()Ljava/lang/Boolean;
p3 = (( java.lang.Boolean ) p3 ).booleanValue ( ); // invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
(( e.h.b.a.m.d ) p1 ).b ( p3 ); // invoke-virtual {p1, p3}, Le/h/b/a/m/d;->b(Z)V
/* .line 50 */
(( e.h.b.a.l.y0 ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/d;Landroid/view/View;)V
return;
} // .end method
public final void a ( Object p0, Object p1 ) {
/* .locals 2 */
/* .line 63 */
(( e.h.b.a.l.y0 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;
final String v0 = "customizableDevice"; // const-string v0, "customizableDevice"
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 64 */
e.h.b.a.p.i .c ( p1 );
(( e.h.b.a.m.d ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/h/b/a/m/d;->a(Le/h/b/a/p/i;)V
} // :cond_0
return;
} // .end method
public final void a ( Object p0, Object p1 ) {
/* .locals 3 */
/* .line 29 */
(( e.h.b.a.m.e ) p2 ).G ( ); // invoke-virtual {p2}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;
v1 = this.c;
/* const v2, 0x7f07009d */
(( android.content.Context ) v1 ).getDrawable ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;
(( c.b.q.v ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 30 */
(( e.h.b.a.m.e ) p2 ).N ( ); // invoke-virtual {p2}, Le/h/b/a/m/e;->N()Lcom/orange/hce/proto/activity/StateImageButton;
v1 = this.c;
/* const v2, 0x7f0700b4 */
(( android.content.Context ) v1 ).getDrawable ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;
(( c.b.q.v ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 31 */
v0 = this.c;
v0 = (( e.h.b.a.m.d ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Le/h/b/a/m/d;->b(Landroid/content/Context;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 32 */
(( e.h.b.a.l.y0 ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/h/b/a/l/y0;->b(Le/h/b/a/m/e;)V
/* .line 33 */
} // :cond_0
v0 = this.c;
v0 = (( e.h.b.a.m.d ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/h/b/a/m/d;->a(Landroid/content/Context;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 34 */
(( e.h.b.a.l.y0 ) p0 ).d ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/h/b/a/l/y0;->d(Le/h/b/a/m/e;Le/h/b/a/m/d;)V
/* .line 35 */
(( e.h.b.a.l.y0 ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/e;)V
} // :cond_1
return;
} // .end method
public final void a ( Object p0, Object p1, Integer p2 ) {
/* .locals 1 */
/* .line 54 */
(( e.h.b.a.m.d ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/h/b/a/m/d;->a(Le/h/b/a/m/i;)V
/* .line 55 */
p2 = this.h;
/* new-instance v0, Le/h/b/a/l/w0; */
/* invoke-direct {v0, p0, p1}, Le/h/b/a/l/w0;-><init>(Le/h/b/a/l/y0;Le/h/b/a/m/d;)V */
(( e.h.b.a.l.y0 ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Ljava/util/concurrent/ConcurrentHashMap;ILjava/util/TimerTask;)V
return;
} // .end method
public final void a ( Object p0, java.util.concurrent.ConcurrentHashMap p1, Integer p2, java.util.TimerTask p3 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/h/b/a/m/d;", */
/* "Ljava/util/concurrent/ConcurrentHashMap<", */
/* "Le/h/b/a/m/d;", */
/* "Ljava/util/Timer;", */
/* ">;I", */
/* "Ljava/util/TimerTask;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 56 */
(( java.util.concurrent.ConcurrentHashMap ) p2 ).get ( p1 ); // invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/Timer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 57 */
(( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
/* .line 58 */
} // :cond_0
/* new-instance v0, Ljava/util/Timer; */
/* invoke-direct {v0}, Ljava/util/Timer;-><init>()V */
/* int-to-long v1, p3 */
/* .line 59 */
(( java.util.Timer ) v0 ).schedule ( p4, v1, v2 ); // invoke-virtual {v0, p4, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
/* .line 60 */
(( java.util.concurrent.ConcurrentHashMap ) p2 ).put ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 3 */
/* .line 36 */
(( e.h.b.a.m.e ) p1 ).G ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;
/* iget-boolean v1, p0, Le/h/b/a/l/y0;->j:Z */
java.lang.Boolean .valueOf ( v1 );
(( com.orange.hce.proto.activity.StateImageButton ) v0 ).setActive ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/hce/proto/activity/StateImageButton;->setActive(Ljava/lang/Boolean;)V
/* .line 37 */
/* iget-boolean v0, p0, Le/h/b/a/l/y0;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Le/h/b/a/l/y0;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 38 */
} // :goto_0
/* iget-boolean v1, p0, Le/h/b/a/l/y0;->j:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 39 */
(( e.h.b.a.m.e ) p1 ).G ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;
v1 = this.c;
/* const v2, 0x7f07009c */
(( android.content.Context ) v1 ).getDrawable ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;
(( c.b.q.v ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 40 */
} // :cond_1
/* iget-boolean v0, p0, Le/h/b/a/l/y0;->j:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 41 */
(( e.h.b.a.m.e ) p1 ).G ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;
v1 = this.c;
/* const v2, 0x7f07009e */
(( android.content.Context ) v1 ).getDrawable ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;
(( c.b.q.v ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 42 */
} // :cond_2
(( e.h.b.a.m.e ) p1 ).G ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;
v1 = this.c;
/* const v2, 0x7f07009d */
(( android.content.Context ) v1 ).getDrawable ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;
(( c.b.q.v ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 43 */
} // :goto_1
(( e.h.b.a.m.e ) p1 ).G ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;
/* new-instance v0, Le/h/b/a/l/v; */
/* invoke-direct {v0, p0}, Le/h/b/a/l/v;-><init>(Le/h/b/a/l/y0;)V */
(( com.orange.hce.proto.activity.StateImageButton ) p1 ).setOnClickListenerWitoutChangingState ( v0 ); // invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setOnClickListenerWitoutChangingState(Landroid/view/View$OnClickListener;)V
return;
} // .end method
public final void a ( Object p0, Object p1 ) {
/* .locals 2 */
/* .line 44 */
(( e.h.b.a.m.e ) p1 ).C ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->C()Landroid/view/View;
/* .line 45 */
(( e.h.b.a.m.e ) p1 ).M ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->M()Lcom/orange/hce/proto/activity/StateImageButton;
/* .line 46 */
v1 = (( e.h.b.a.m.d ) p2 ).u ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->u()Z
java.lang.Boolean .valueOf ( v1 );
(( com.orange.hce.proto.activity.StateImageButton ) p1 ).setActive ( v1 ); // invoke-virtual {p1, v1}, Lcom/orange/hce/proto/activity/StateImageButton;->setActive(Ljava/lang/Boolean;)V
/* .line 47 */
(( e.h.b.a.l.y0 ) p0 ).c ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/d;Landroid/view/View;)V
/* .line 48 */
/* new-instance v1, Le/h/b/a/l/t; */
/* invoke-direct {v1, p0, p2, v0}, Le/h/b/a/l/t;-><init>(Le/h/b/a/l/y0;Le/h/b/a/m/d;Landroid/view/View;)V */
(( com.orange.hce.proto.activity.StateImageButton ) p1 ).setOnClickListener ( v1 ); // invoke-virtual {p1, v1}, Lcom/orange/hce/proto/activity/StateImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
return;
} // .end method
public void a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, Integer p2 ) {
/* .locals 3 */
/* .line 115 */
v0 = this.f;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Le/h/b/a/m/d; */
/* .line 116 */
v2 = (( e.h.b.a.l.y0 ) p0 ).a ( p1, p2, v1 ); // invoke-virtual {p0, p1, p2, v1}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Le/h/b/a/m/d;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 117 */
p1 = p1 = this.f;
/* .line 118 */
com.orange.oab.contactless.packid.rssi.RssiLevel .values ( );
/* aget-object p2, p2, p3 */
(( e.h.b.a.m.d ) v1 ).a ( p2 ); // invoke-virtual {v1, p2}, Le/h/b/a/m/d;->a(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
/* .line 119 */
(( androidx.recyclerview.widget.RecyclerView$g ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$g;->a(ILjava/lang/Object;)V
} // :cond_1
return;
} // .end method
public void a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, Boolean p2 ) {
/* .locals 3 */
/* .line 120 */
v0 = this.f;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Le/h/b/a/m/d; */
/* .line 121 */
v2 = (( e.h.b.a.l.y0 ) p0 ).a ( p1, p2, v1 ); // invoke-virtual {p0, p1, p2, v1}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Le/h/b/a/m/d;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 122 */
p1 = p1 = this.f;
/* .line 123 */
(( e.h.b.a.m.d ) v1 ).a ( p3 ); // invoke-virtual {v1, p3}, Le/h/b/a/m/d;->a(Z)V
/* .line 124 */
(( androidx.recyclerview.widget.RecyclerView$g ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$g;->a(ILjava/lang/Object;)V
} // :cond_1
return;
} // .end method
public final void a ( java.lang.String p0, Object p1 ) {
/* .locals 2 */
/* .line 107 */
v0 = (( e.h.b.a.m.d ) p2 ).t ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->t()Z
/* if-nez v0, :cond_0 */
return;
/* .line 108 */
} // :cond_0
v0 = e.h.b.a.p.i .b ( p1 );
final String v1 = "customizableDevice"; // const-string v1, "customizableDevice"
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 109 */
(( e.h.b.a.l.y0 ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;
/* .line 110 */
e.h.b.a.p.i .c ( p1 );
(( e.h.b.a.m.d ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/h/b/a/m/d;->a(Le/h/b/a/p/i;)V
/* .line 111 */
} // :cond_1
(( e.h.b.a.l.y0 ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;
int p1 = 0; // const/4 p1, 0x0
/* .line 112 */
(( e.h.b.a.m.d ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/h/b/a/m/d;->a(Le/h/b/a/p/i;)V
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
/* .line 113 */
(( e.h.b.a.l.y0 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/b/a/l/y0;->b(Z)Z
return;
} // .end method
public void a ( java.util.List p0, java.util.List p1, Boolean p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/h/b/a/m/d;", */
/* ">;", */
/* "Ljava/util/List<", */
/* "Le/h/b/a/m/d;", */
/* ">;Z)V" */
/* } */
} // .end annotation
/* .line 65 */
this.d = p1;
/* .line 66 */
this.e = p2;
/* .line 67 */
(( e.h.b.a.l.y0 ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/h/b/a/l/y0;->a(Ljava/util/List;)Ljava/util/List;
/* .line 68 */
p1 = v0 = this.f;
int v0 = 0; // const/4 v0, 0x0
/* .line 69 */
v1 = } // :goto_0
/* if-ge v0, v1, :cond_1 */
/* .line 70 */
v1 = v1 = this.f;
/* if-nez v1, :cond_0 */
/* .line 71 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "add:"; // const-string v1, "add:"
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.badgeAdapter"; // const-string v1, "packid.badgeAdapter"
android.util.Log .i ( v1,p1 );
/* .line 72 */
p1 = this.f;
/* check-cast v1, Le/h/b/a/m/d; */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* if-nez p1, :cond_2 */
if ( p3 != null) { // if-eqz p3, :cond_3
/* .line 73 */
} // :cond_2
(( e.h.b.a.l.y0 ) p0 ).e ( ); // invoke-virtual {p0}, Le/h/b/a/l/y0;->e()V
} // :cond_3
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 90 */
/* iget-boolean v0, p0, Le/h/b/a/l/y0;->m:Z */
/* if-eq v0, p1, :cond_0 */
/* .line 91 */
/* iput-boolean p1, p0, Le/h/b/a/l/y0;->m:Z */
/* .line 92 */
(( androidx.recyclerview.widget.RecyclerView$g ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->c()V
} // :cond_0
return;
} // .end method
public void a ( Boolean p0, Boolean p1, Boolean p2 ) {
/* .locals 0 */
/* .line 86 */
/* iput-boolean p3, p0, Le/h/b/a/l/y0;->l:Z */
/* .line 87 */
/* iput-boolean p2, p0, Le/h/b/a/l/y0;->k:Z */
/* .line 88 */
/* iput-boolean p1, p0, Le/h/b/a/l/y0;->j:Z */
/* .line 89 */
(( e.h.b.a.l.y0 ) p0 ).d ( ); // invoke-virtual {p0}, Le/h/b/a/l/y0;->d()V
return;
} // .end method
public Boolean a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, Object p2 ) {
/* .locals 2 */
/* .line 114 */
(( e.h.b.a.m.d ) p3 ).q ( ); // invoke-virtual {p3}, Le/h/b/a/m/d;->q()Le/h/b/a/m/a;
v1 = e.h.b.a.m.a.b;
/* if-ne v0, v1, :cond_0 */
(( e.h.b.a.m.d ) p3 ).d ( ); // invoke-virtual {p3}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
p1 = (( fr.mbs.binary.Octets ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
(( e.h.b.a.m.d ) p3 ).a ( ); // invoke-virtual {p3}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
p1 = (( fr.mbs.binary.Octets ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Integer b ( Integer p0 ) {
/* .locals 1 */
/* .line 10 */
v0 = this.f;
/* check-cast p1, Le/h/b/a/m/d; */
(( e.h.b.a.m.d ) p1 ).q ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->q()Le/h/b/a/m/a;
p1 = (( java.lang.Enum ) p1 ).ordinal ( ); // invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I
} // .end method
public Integer b ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 1 */
/* .line 78 */
(( e.h.b.a.l.y0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/m/d;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 79 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Badge "; // const-string v0, "Badge "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.h.b.a.m.d ) p1 ).b ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->b()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " locked"; // const-string v0, " locked"
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "packid.badgeAdapter"; // const-string v0, "packid.badgeAdapter"
android.util.Log .d ( v0,p2 );
int p2 = 1; // const/4 p2, 0x1
/* .line 80 */
(( e.h.b.a.m.d ) p1 ).d ( p2 ); // invoke-virtual {p1, p2}, Le/h/b/a/m/d;->d(Z)V
/* .line 81 */
} // :cond_0
p1 = p2 = this.f;
} // .end method
public androidx.recyclerview.widget.RecyclerView$d0 b ( android.view.ViewGroup p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
(( android.view.ViewGroup ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
android.view.LayoutInflater .from ( v0 );
/* .line 2 */
v1 = e.h.b.a.m.a.d;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 0; // const/4 v2, 0x0
/* if-ne p2, v1, :cond_0 */
/* const p2, 0x7f0b0025 */
/* .line 3 */
(( android.view.LayoutInflater ) v0 ).inflate ( p2, p1, v2 ); // invoke-virtual {v0, p2, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* .line 4 */
/* new-instance p2, Le/h/b/a/m/f; */
/* invoke-direct {p2, p1}, Le/h/b/a/m/f;-><init>(Landroid/view/View;)V */
/* .line 5 */
} // :cond_0
v1 = e.h.b.a.m.a.c;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
/* if-ne p2, v1, :cond_1 */
/* const p2, 0x7f0b0044 */
/* .line 6 */
(( android.view.LayoutInflater ) v0 ).inflate ( p2, p1, v2 ); // invoke-virtual {v0, p2, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* .line 7 */
/* new-instance p2, Le/h/b/a/m/g; */
/* invoke-direct {p2, p1}, Le/h/b/a/m/g;-><init>(Landroid/view/View;)V */
} // :cond_1
/* const p2, 0x7f0b0026 */
/* .line 8 */
(( android.view.LayoutInflater ) v0 ).inflate ( p2, p1, v2 ); // invoke-virtual {v0, p2, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* .line 9 */
/* new-instance p2, Le/h/b/a/m/e; */
/* invoke-direct {p2, p1}, Le/h/b/a/m/e;-><init>(Landroid/view/View;)V */
} // .end method
public java.util.List b ( Object p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/h/b/a/m/d;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Le/h/b/a/m/d;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 70 */
(( e.h.b.a.l.y0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;)Ljava/util/List;
/* .line 71 */
(( e.h.b.a.l.y0 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/b/a/l/y0;->b(Ljava/util/List;)V
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView$d0 p0, Integer p1 ) {
/* .locals 2 */
/* .line 11 */
v0 = this.f;
/* check-cast p2, Le/h/b/a/m/d; */
/* .line 12 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).i ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->i()I
v1 = e.h.b.a.m.a.b;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
/* if-ne v0, v1, :cond_0 */
/* .line 13 */
(( e.h.b.a.l.y0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/b/a/l/y0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;Le/h/b/a/m/d;)V
/* .line 14 */
} // :cond_0
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).i ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->i()I
v1 = e.h.b.a.m.a.d;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
/* if-ne v0, v1, :cond_1 */
/* .line 15 */
(( e.h.b.a.l.y0 ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/b/a/l/y0;->b(Landroidx/recyclerview/widget/RecyclerView$d0;Le/h/b/a/m/d;)V
/* .line 16 */
} // :cond_1
(( e.h.b.a.l.y0 ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/h/b/a/l/y0;->e(Landroidx/recyclerview/widget/RecyclerView$d0;)V
} // :goto_0
return;
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView$d0 p0, Object p1 ) {
/* .locals 2 */
/* .line 22 */
/* check-cast p1, Le/h/b/a/m/f; */
/* .line 23 */
(( e.h.b.a.m.f ) p1 ).D ( ); // invoke-virtual {p1}, Le/h/b/a/m/f;->D()Landroid/widget/TextView;
(( e.h.b.a.m.d ) p2 ).o ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->o()Ljava/lang/String;
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 24 */
(( e.h.b.a.m.d ) p2 ).e ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->e()Le/h/b/a/p/i;
/* const v1, 0x7f0d0003 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 25 */
(( e.h.b.a.m.d ) p2 ).e ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->e()Le/h/b/a/p/i;
p2 = (( e.h.b.a.p.i ) p2 ).a ( ); // invoke-virtual {p2}, Le/h/b/a/p/i;->a()I
/* .line 26 */
(( e.h.b.a.m.f ) p1 ).C ( ); // invoke-virtual {p1}, Le/h/b/a/m/f;->C()Landroid/widget/ImageView;
e.h.b.a.d .a ( v0 );
/* .line 27 */
java.lang.Integer .valueOf ( p2 );
(( e.h.b.a.g ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Le/h/b/a/g;->a(Ljava/lang/Integer;)Le/h/b/a/f;
/* .line 28 */
(( e.h.b.a.f ) p2 ).b ( v1 ); // invoke-virtual {p2, v1}, Le/h/b/a/f;->b(I)Le/h/b/a/f;
/* .line 29 */
(( e.h.b.a.f ) p2 ).b ( ); // invoke-virtual {p2}, Le/h/b/a/f;->b()Le/h/b/a/f;
v0 = e.b.a.y.x.c0.c;
/* .line 30 */
(( e.h.b.a.f ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/h/b/a/f;->a(Le/b/a/y/x/c0;)Le/h/b/a/f;
/* .line 31 */
(( e.h.b.a.m.f ) p1 ).C ( ); // invoke-virtual {p1}, Le/h/b/a/m/f;->C()Landroid/widget/ImageView;
(( e.b.a.s ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/b/a/s;->a(Landroid/widget/ImageView;)Le/b/a/c0/o/k;
/* .line 32 */
} // :cond_0
(( e.h.b.a.m.f ) p1 ).C ( ); // invoke-virtual {p1}, Le/h/b/a/m/f;->C()Landroid/widget/ImageView;
e.h.b.a.d .a ( v0 );
/* .line 33 */
(( e.h.b.a.m.d ) p2 ).n ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) p2 ).getLogoUrl ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getLogoUrl()Ljava/lang/String;
(( e.h.b.a.g ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Le/h/b/a/g;->a(Ljava/lang/String;)Le/h/b/a/f;
/* .line 34 */
(( e.h.b.a.f ) p2 ).b ( v1 ); // invoke-virtual {p2, v1}, Le/h/b/a/f;->b(I)Le/h/b/a/f;
/* .line 35 */
(( e.h.b.a.f ) p2 ).b ( ); // invoke-virtual {p2}, Le/h/b/a/f;->b()Le/h/b/a/f;
v0 = e.b.a.y.x.c0.c;
/* .line 36 */
(( e.h.b.a.f ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/h/b/a/f;->a(Le/b/a/y/x/c0;)Le/h/b/a/f;
/* .line 37 */
(( e.h.b.a.m.f ) p1 ).C ( ); // invoke-virtual {p1}, Le/h/b/a/m/f;->C()Landroid/widget/ImageView;
(( e.b.a.s ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/b/a/s;->a(Landroid/widget/ImageView;)Le/b/a/c0/o/k;
} // :goto_0
return;
} // .end method
public void b ( Object p0, android.view.View p1 ) { //synthethic
/* .locals 1 */
/* .line 48 */
v0 = this.g;
/* check-cast p2, Lcom/orange/hce/proto/activity/StateImageButton; */
(( com.orange.hce.proto.activity.StateImageButton ) p2 ).getActive ( ); // invoke-virtual {p2}, Lcom/orange/hce/proto/activity/StateImageButton;->getActive()Ljava/lang/Boolean;
return;
} // .end method
public final void b ( Object p0, Object p1 ) {
/* .locals 1 */
/* .line 17 */
v0 = (( e.h.b.a.m.d ) p1 ).w ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->w()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 18 */
(( e.h.b.a.m.e ) p2 ).L ( ); // invoke-virtual {p2}, Le/h/b/a/m/e;->L()Lcom/orange/hce/proto/activity/StateImageButton;
p1 = (( e.h.b.a.m.d ) p1 ).x ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->x()Z
java.lang.Boolean .valueOf ( p1 );
(( com.orange.hce.proto.activity.StateImageButton ) v0 ).setActive ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/hce/proto/activity/StateImageButton;->setActive(Ljava/lang/Boolean;)V
/* .line 19 */
(( e.h.b.a.m.e ) p2 ).L ( ); // invoke-virtual {p2}, Le/h/b/a/m/e;->L()Lcom/orange/hce/proto/activity/StateImageButton;
int v0 = 0; // const/4 v0, 0x0
(( android.widget.ImageButton ) p1 ).setEnabled ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V
/* .line 20 */
(( e.h.b.a.m.e ) p2 ).L ( ); // invoke-virtual {p2}, Le/h/b/a/m/e;->L()Lcom/orange/hce/proto/activity/StateImageButton;
(( android.widget.ImageButton ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V
/* .line 21 */
} // :cond_0
(( e.h.b.a.m.e ) p2 ).L ( ); // invoke-virtual {p2}, Le/h/b/a/m/e;->L()Lcom/orange/hce/proto/activity/StateImageButton;
/* const/16 p2, 0x8 */
(( android.widget.ImageButton ) p1 ).setVisibility ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setVisibility(I)V
} // :goto_0
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 2 */
/* .line 38 */
(( e.h.b.a.m.e ) p1 ).N ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->N()Lcom/orange/hce/proto/activity/StateImageButton;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.ImageButton ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V
/* .line 39 */
(( e.h.b.a.m.e ) p1 ).N ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->N()Lcom/orange/hce/proto/activity/StateImageButton;
v0 = this.c;
v0 = com.orange.business.packid.android.lib.PackIdUtility .isNfcEnabled ( v0 );
java.lang.Boolean .valueOf ( v0 );
(( com.orange.hce.proto.activity.StateImageButton ) p1 ).setActive ( v0 ); // invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setActive(Ljava/lang/Boolean;)V
return;
} // .end method
public final void b ( Object p0, Object p1 ) {
/* .locals 4 */
/* .line 40 */
(( e.h.b.a.m.d ) p2 ).p ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->p()Le/h/b/a/m/i;
(( e.h.b.a.m.i ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/h/b/a/m/i;->a(Le/h/b/a/m/e;Le/h/b/a/m/d;)V
/* .line 41 */
(( e.h.b.a.m.e ) p1 ).E ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->E()Landroid/widget/ImageView;
/* .line 42 */
v0 = this.c;
v0 = com.orange.business.packid.android.lib.PackIdUtility .isBluetoothEnabled ( v0 );
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( e.h.b.a.m.d ) p2 ).r ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->r()Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( e.h.b.a.m.d ) p2 ).y ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->y()Z
/* if-nez v0, :cond_0 */
} // :cond_0
/* const v0, 0x7f0700d8 */
/* .line 43 */
(( android.widget.ImageView ) p1 ).setBackgroundResource ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V
/* .line 44 */
(( android.widget.ImageView ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;
final String v2 = "vibrator"; // const-string v2, "vibrator"
(( android.content.Context ) v0 ).getSystemService ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/os/Vibrator; */
/* .line 45 */
(( e.h.b.a.m.d ) p2 ).p ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->p()Le/h/b/a/m/i;
v3 = e.h.b.a.m.i.d;
/* if-eq v2, v3, :cond_1 */
} // :cond_1
/* new-instance v1, Le/h/b/a/l/q; */
/* invoke-direct {v1, p0, v0, p2}, Le/h/b/a/l/q;-><init>(Le/h/b/a/l/y0;Landroid/os/Vibrator;Le/h/b/a/m/d;)V */
} // :goto_0
(( android.widget.ImageView ) p1 ).setOnClickListener ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
} // :cond_2
} // :goto_1
/* const p2, 0x7f070062 */
/* .line 46 */
(( android.widget.ImageView ) p1 ).setBackgroundResource ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setBackgroundResource(I)V
/* .line 47 */
(( android.widget.ImageView ) p1 ).setOnClickListener ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
} // :goto_2
return;
} // .end method
public final void b ( java.util.List p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/h/b/a/m/d;", */
/* ">;)V" */
/* } */
} // .end annotation
v0 = /* .line 72 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* .line 73 */
/* check-cast v3, Le/h/b/a/m/d; */
/* add-int/lit8 v2, v2, 0x1 */
/* if-ne v2, v0, :cond_0 */
int v4 = 1; // const/4 v4, 0x1
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
/* .line 74 */
} // :goto_1
(( e.h.b.a.m.d ) v3 ).c ( v4 ); // invoke-virtual {v3, v4}, Le/h/b/a/m/d;->c(Z)V
} // :cond_1
return;
} // .end method
public final Boolean b ( Object p0, Object p1 ) {
/* .locals 2 */
/* .line 75 */
(( e.h.b.a.m.d ) p2 ).q ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->q()Le/h/b/a/m/a;
v1 = e.h.b.a.m.a.b;
/* if-eq v0, v1, :cond_0 */
(( e.h.b.a.m.d ) p2 ).q ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->q()Le/h/b/a/m/a;
v1 = e.h.b.a.m.a.c;
/* if-ne v0, v1, :cond_1 */
/* .line 76 */
} // :cond_0
(( e.h.b.a.m.d ) p1 ).n ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 77 */
(( e.h.b.a.m.d ) p1 ).n ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v0 ).getName ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;
(( e.h.b.a.m.d ) p2 ).n ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v1 ).getName ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
(( e.h.b.a.m.d ) p1 ).d ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
(( e.h.b.a.m.d ) p2 ).d ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
/* if-ne p1, p2, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean b ( Boolean p0 ) {
/* .locals 12 */
/* .line 49 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 50 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 51 */
/* new-instance v2, Lcom/orange/business/packid/android/lib/PackId; */
v3 = this.c;
/* invoke-direct {v2, v3}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v2 ).getUsers ( ); // invoke-virtual {v2}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;
v3 = /* .line 52 */
final String v4 = "packid.badgeAdapter"; // const-string v4, "packid.badgeAdapter"
int v5 = 1; // const/4 v5, 0x1
int v6 = 0; // const/4 v6, 0x0
/* if-ne v3, v5, :cond_0 */
/* check-cast v3, Lcom/orange/oab/contactless/packid/hce/user/User; */
v3 = (( com.orange.oab.contactless.packid.hce.user.User ) v3 ).isDefault ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/User;->isDefault()Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 53 */
/* check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 54 */
/* new-instance v3, Le/h/b/a/m/d; */
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getWallet ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v5 ).getBadges ( ); // invoke-virtual {v5}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
/* check-cast v5, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
v7 = this.c;
/* invoke-direct {v3, v5, v2, v7}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/content/Context;)V */
/* .line 55 */
/* new-instance v5, Le/h/b/a/m/d; */
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getTenant ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getContactlessId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
/* invoke-direct {v5, v7, v2, v6}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;Lfr/mbs/binary/Octets;Z)V */
/* .line 56 */
(( e.h.b.a.l.y0 ) p0 ).a ( v3, v5 ); // invoke-virtual {p0, v3, v5}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Le/h/b/a/m/d;)V
/* .line 57 */
(( java.util.ArrayList ) v0 ).add ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 58 */
(( java.util.ArrayList ) v1 ).add ( v5 ); // invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
final String v2 = "##### custome default badge"; // const-string v2, "##### custome default badge"
/* .line 59 */
android.util.Log .i ( v4,v2 );
/* goto/16 :goto_2 */
/* .line 60 */
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
} // :cond_1
v7 = } // :goto_0
if ( v7 != null) { // if-eqz v7, :cond_4
/* check-cast v7, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 61 */
/* new-instance v8, Le/h/b/a/m/d; */
(( com.orange.oab.contactless.packid.hce.user.User ) v7 ).getTenant ( ); // invoke-virtual {v7}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( com.orange.oab.contactless.packid.hce.user.User ) v7 ).getContactlessId ( ); // invoke-virtual {v7}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
/* invoke-direct {v8, v9, v10, v6}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;Lfr/mbs/binary/Octets;Z)V */
(( java.util.ArrayList ) v1 ).add ( v8 ); // invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 62 */
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v9 = "User tenant is "; // const-string v9, "User tenant is "
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.hce.user.User ) v7 ).getTenant ( ); // invoke-virtual {v7}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v4,v8 );
/* .line 63 */
(( com.orange.oab.contactless.packid.hce.user.User ) v7 ).getWallet ( ); // invoke-virtual {v7}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v8 ).getBadges ( ); // invoke-virtual {v8}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
v9 = /* .line 64 */
if ( v9 != null) { // if-eqz v9, :cond_2
/* .line 65 */
/* new-instance v8, Le/h/b/a/m/d; */
(( com.orange.oab.contactless.packid.hce.user.User ) v7 ).getTenant ( ); // invoke-virtual {v7}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( com.orange.oab.contactless.packid.hce.user.User ) v7 ).getContactlessId ( ); // invoke-virtual {v7}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
/* invoke-direct {v8, v9, v7, v5}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;Lfr/mbs/binary/Octets;Z)V */
(( java.util.ArrayList ) v0 ).add ( v8 ); // invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 66 */
} // :cond_2
v9 = } // :goto_1
if ( v9 != null) { // if-eqz v9, :cond_1
/* check-cast v9, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* .line 67 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v9 ).getStatus ( ); // invoke-virtual {v9}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getStatus()Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;
v11 = com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus.INSTALLING;
/* if-ne v10, v11, :cond_3 */
int v3 = 1; // const/4 v3, 0x1
/* .line 68 */
} // :cond_3
/* new-instance v10, Le/h/b/a/m/d; */
v11 = this.c;
/* invoke-direct {v10, v9, v7, v11}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/content/Context;)V */
(( java.util.ArrayList ) v0 ).add ( v10 ); // invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_4
/* move v6, v3 */
/* .line 69 */
} // :goto_2
(( e.h.b.a.l.y0 ) p0 ).a ( v1, v0, p1 ); // invoke-virtual {p0, v1, v0, p1}, Le/h/b/a/l/y0;->a(Ljava/util/List;Ljava/util/List;Z)V
} // .end method
public Integer c ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 1 */
/* .line 7 */
(( e.h.b.a.l.y0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/m/d;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 8 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Badge "; // const-string v0, "Badge "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.h.b.a.m.d ) p1 ).b ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->b()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " unlocked"; // const-string v0, " unlocked"
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "packid.badgeAdapter"; // const-string v0, "packid.badgeAdapter"
android.util.Log .d ( v0,p2 );
int p2 = 0; // const/4 p2, 0x0
/* .line 9 */
(( e.h.b.a.m.d ) p1 ).d ( p2 ); // invoke-virtual {p1, p2}, Le/h/b/a/m/d;->d(Z)V
/* .line 10 */
} // :cond_0
p1 = p2 = this.f;
} // .end method
public final android.content.SharedPreferences c ( Object p0 ) {
/* .locals 3 */
/* .line 6 */
v0 = this.c;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( e.h.b.a.m.d ) p1 ).d ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.h.b.a.m.d ) p1 ).a ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) p1 ).toHexa ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
(( android.content.Context ) v0 ).getSharedPreferences ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
} // .end method
public final void c ( Object p0, android.view.View p1 ) {
/* .locals 0 */
/* .line 1 */
p1 = (( e.h.b.a.m.d ) p1 ).u ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->u()Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
/* const/16 p1, 0x8 */
} // :goto_0
(( android.view.View ) p2 ).setVisibility ( p1 ); // invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V
return;
} // .end method
public final void c ( Object p0, Object p1 ) {
/* .locals 2 */
/* .line 2 */
(( e.h.b.a.m.e ) p1 ).I ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->I()Lcom/orange/hce/proto/activity/StateImageButton;
/* .line 3 */
(( e.h.b.a.l.y0 ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;
final String v0 = "isFavorite"; // const-string v0, "isFavorite"
int v1 = 0; // const/4 v1, 0x0
v0 = /* .line 4 */
java.lang.Boolean .valueOf ( v0 );
(( com.orange.hce.proto.activity.StateImageButton ) p1 ).setActive ( v0 ); // invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setActive(Ljava/lang/Boolean;)V
/* .line 5 */
/* new-instance v0, Le/h/b/a/l/r; */
/* invoke-direct {v0, p0, p2}, Le/h/b/a/l/r;-><init>(Le/h/b/a/l/y0;Landroid/content/SharedPreferences;)V */
(( com.orange.hce.proto.activity.StateImageButton ) p1 ).setOnClickListener ( v0 ); // invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
return;
} // .end method
public e.h.b.a.m.d d ( Integer p0 ) {
/* .locals 1 */
/* .line 6 */
v0 = v0 = this.f;
/* if-nez v0, :cond_1 */
v0 = v0 = this.f;
/* if-lt p1, v0, :cond_0 */
/* .line 7 */
} // :cond_0
v0 = this.f;
/* check-cast p1, Le/h/b/a/m/d; */
} // :cond_1
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void d ( ) {
/* .locals 2 */
/* .line 5 */
v0 = this.i;
/* new-instance v1, Le/h/b/a/l/a; */
/* invoke-direct {v1, p0}, Le/h/b/a/l/a;-><init>(Le/h/b/a/l/y0;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
return;
} // .end method
public final void d ( Object p0, Object p1 ) {
/* .locals 2 */
/* .line 1 */
(( e.h.b.a.m.e ) p1 ).P ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->P()Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;
int v1 = 0; // const/4 v1, 0x0
(( android.view.View ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
/* .line 2 */
v0 = this.c;
v0 = com.orange.business.packid.android.lib.PackIdUtility .getBluetoothState ( v0 );
/* const/16 v1, 0xc */
/* if-ne v1, v0, :cond_0 */
/* .line 3 */
(( e.h.b.a.m.e ) p1 ).P ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->P()Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;
(( e.h.b.a.m.d ) p2 ).k ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->k()Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
(( com.orange.hce.proto.activity.NetworkQualityIndicatorView ) p1 ).setRssiLevel ( p2 ); // invoke-virtual {p1, p2}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->setRssiLevel(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
/* .line 4 */
} // :cond_0
(( e.h.b.a.m.e ) p1 ).S ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->S()V
} // :goto_0
return;
} // .end method
public void e ( ) {
/* .locals 5 */
/* .line 9 */
v0 = this.d;
e.h.b.a.p.h .a ( );
java.util.Collections .sort ( v0,v1 );
/* .line 10 */
v0 = this.e;
v1 = this.c;
e.h.b.a.p.h .a ( v1 );
java.util.Collections .sort ( v0,v1 );
/* .line 11 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 12 */
v1 = this.d;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Le/h/b/a/m/d; */
/* .line 13 */
(( e.h.b.a.l.y0 ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Le/h/b/a/l/y0;->b(Le/h/b/a/m/d;)Ljava/util/List;
v4 = /* .line 14 */
/* if-nez v4, :cond_0 */
/* .line 15 */
/* .line 16 */
/* .line 17 */
} // :cond_1
this.f = v0;
/* .line 18 */
(( androidx.recyclerview.widget.RecyclerView$g ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->c()V
/* .line 19 */
v0 = this.c;
com.orange.hce.proto.widget.PackIdWidgetProvider .c ( v0 );
return;
} // .end method
public final void e ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 1 */
/* .line 1 */
/* check-cast p1, Le/h/b/a/m/g; */
/* .line 2 */
(( e.h.b.a.m.g ) p1 ).C ( ); // invoke-virtual {p1}, Le/h/b/a/m/g;->C()Landroid/widget/TextView;
/* const v0, 0x7f0e00dc */
(( android.widget.TextView ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V
return;
} // .end method
public final void e ( Object p0, Object p1 ) {
/* .locals 3 */
/* .line 3 */
(( e.h.b.a.m.e ) p1 ).O ( ); // invoke-virtual {p1}, Le/h/b/a/m/e;->O()Lcom/orange/hce/proto/activity/StateImageButton;
/* .line 4 */
v0 = (( e.h.b.a.m.d ) p2 ).y ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->y()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
(( com.orange.hce.proto.activity.StateImageButton ) p1 ).setActivated ( v0 ); // invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setActivated(Z)V
/* .line 6 */
(( android.widget.ImageButton ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;
(( e.h.b.a.m.d ) p2 ).d ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
(( e.h.b.a.m.d ) p2 ).a ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
v0 = com.orange.oab.contactless.packid.service.ZoneDetectionNotification .isAutorised ( v0,v1,v2 );
java.lang.Boolean .valueOf ( v0 );
(( com.orange.hce.proto.activity.StateImageButton ) p1 ).setActive ( v0 ); // invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setActive(Ljava/lang/Boolean;)V
/* .line 7 */
/* new-instance v0, Le/h/b/a/l/s; */
/* invoke-direct {v0, p0, p2}, Le/h/b/a/l/s;-><init>(Le/h/b/a/l/y0;Le/h/b/a/m/d;)V */
(( com.orange.hce.proto.activity.StateImageButton ) p1 ).setOnClickListener ( v0 ); // invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
/* .line 8 */
(( com.orange.hce.proto.activity.StateImageButton ) p1 ).setActivated ( p2 ); // invoke-virtual {p1, p2}, Lcom/orange/hce/proto/activity/StateImageButton;->setActivated(Z)V
} // :goto_0
return;
} // .end method
