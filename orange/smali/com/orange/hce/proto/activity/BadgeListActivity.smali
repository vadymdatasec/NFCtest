.class public Lcom/orange/hce/proto/activity/BadgeListActivity;
.super Lc/b/k/r;
.source "SourceFile"

# interfaces
.implements Le/h/b/a/l/y0$a;
.implements Le/h/b/a/p/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/orange/hce/proto/activity/BadgeListActivity$f;
    }
.end annotation


# static fields
.field public static final O:I


# instance fields
.field public A:Landroid/os/Handler;

.field public B:Landroid/widget/ImageButton;

.field public C:Landroidx/recyclerview/widget/RecyclerView;

.field public D:Z

.field public E:Landroidx/recyclerview/widget/LinearLayoutManager;

.field public F:Landroidx/appcompat/widget/LinearLayoutCompat;

.field public G:Landroid/widget/TextView;

.field public H:Le/h/b/a/n/f;

.field public I:Lcom/google/android/material/snackbar/Snackbar;

.field public J:Lcom/google/android/material/snackbar/Snackbar;

.field public K:Landroid/content/BroadcastReceiver;

.field public L:Landroid/content/BroadcastReceiver;

.field public M:Le/h/b/a/n/d;

.field public N:Le/h/b/a/n/e;

.field public q:Le/h/b/a/l/y0;

.field public final r:Landroid/content/BroadcastReceiver;

.field public final s:Landroid/content/BroadcastReceiver;

.field public t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/app/AlertDialog;",
            ">;"
        }
    .end annotation
.end field

.field public u:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

.field public v:Landroid/content/BroadcastReceiver;

.field public w:Landroid/content/BroadcastReceiver;

.field public x:Landroid/app/ProgressDialog;

.field public y:Landroid/view/View;

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sput v0, Lcom/orange/hce/proto/activity/BadgeListActivity;->O:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/b/k/r;-><init>()V

    .line 2
    new-instance v0, Lcom/orange/hce/proto/activity/BadgeListActivity$a;

    invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/BadgeListActivity$a;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->r:Landroid/content/BroadcastReceiver;

    .line 3
    new-instance v0, Lcom/orange/hce/proto/activity/BadgeListActivity$b;

    invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/BadgeListActivity$b;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->s:Landroid/content/BroadcastReceiver;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->t:Ljava/util/List;

    .line 5
    new-instance v0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/orange/hce/proto/activity/BadgeListActivity$f;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;Lcom/orange/hce/proto/activity/BadgeListActivity$a;)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->v:Landroid/content/BroadcastReceiver;

    .line 6
    new-instance v0, Le/h/b/a/n/g;

    invoke-direct {v0, p0}, Le/h/b/a/n/g;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->w:Landroid/content/BroadcastReceiver;

    .line 7
    new-instance v0, Lcom/orange/hce/proto/activity/BadgeListActivity$c;

    invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/BadgeListActivity$c;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->K:Landroid/content/BroadcastReceiver;

    .line 8
    new-instance v0, Lcom/orange/hce/proto/activity/BadgeListActivity$d;

    invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/BadgeListActivity$d;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->L:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static synthetic a(Lcom/orange/hce/proto/activity/BadgeListActivity;Landroid/app/ProgressDialog;)Landroid/app/ProgressDialog;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->x:Landroid/app/ProgressDialog;

    return-object p1
.end method

.method public static synthetic a(Lcom/orange/hce/proto/activity/BadgeListActivity;)Le/h/b/a/l/y0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->q:Le/h/b/a/l/y0;

    return-object p0
.end method

.method public static synthetic a(Lcom/orange/hce/proto/activity/BadgeListActivity;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/orange/hce/proto/activity/BadgeListActivity;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->D:Z

    return p1
.end method

.method public static b(Le/h/b/a/m/d;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/h/b/a/m/d;",
            ")",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Le/h/b/a/m/d;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    const-class p0, Lcom/orange/hce/proto/activity/CoffeeBadgeDetailActivity;

    return-object p0

    .line 4
    :cond_0
    invoke-virtual {p0}, Le/h/b/a/m/d;->t()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 5
    const-class p0, Lcom/orange/hce/proto/activity/DefaultBadgeDetailActivity;

    return-object p0

    .line 6
    :cond_1
    const-class p0, Lcom/orange/hce/proto/activity/AccessBadgeDetailActivity;

    return-object p0
.end method

.method public static synthetic b(Lcom/orange/hce/proto/activity/BadgeListActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->D:Z

    return p0
.end method

.method public static synthetic c(Lcom/orange/hce/proto/activity/BadgeListActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->N()V

    return-void
.end method

.method public static synthetic d(Lcom/orange/hce/proto/activity/BadgeListActivity;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->u:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    return-object p0
.end method

.method public static synthetic e(Lcom/orange/hce/proto/activity/BadgeListActivity;)Landroid/app/ProgressDialog;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->x:Landroid/app/ProgressDialog;

    return-object p0
.end method

.method public static synthetic f(Lcom/orange/hce/proto/activity/BadgeListActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->z:Z

    return p0
.end method

.method public static synthetic g(Lcom/orange/hce/proto/activity/BadgeListActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->s()V

    return-void
.end method


# virtual methods
.method public synthetic A()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->q:Le/h/b/a/l/y0;

    invoke-virtual {v0}, Le/h/b/a/l/y0;->e()V

    return-void
.end method

.method public synthetic B()V
    .locals 4

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Z)V

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->A:Landroid/os/Handler;

    new-instance v1, Le/h/b/a/l/m;

    invoke-direct {v1, p0}, Le/h/b/a/l/m;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public synthetic C()V
    .locals 3

    const-string v0, "packid.BadgeList"

    const-string v1, "scheduleShowcaseDisplay"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->q:Le/h/b/a/l/y0;

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->B:Landroid/widget/ImageButton;

    iget-object v2, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->C:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, v1, v2}, Le/h/b/a/k;->a(Le/h/b/a/l/y0;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public synthetic D()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->t:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    :cond_0
    return-void
.end method

.method public synthetic E()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Z)V

    return-void
.end method

.method public final F()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->t:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final G()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "packid.app.preferences"

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "ADD_SHOW_CASE"

    const/4 v3, 0x1

    .line 2
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 4
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->C:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Le/h/b/a/l/d;

    invoke-direct {v1, p0}, Le/h/b/a/l/d;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final H()V
    .locals 4

    const v0, 0x7f08016b

    .line 1
    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 2
    invoke-virtual {p0, v0}, Lc/b/k/r;->a(Landroidx/appcompat/widget/Toolbar;)V

    .line 3
    invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;

    move-result-object v1

    invoke-virtual {p0}, Lc/b/k/r;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0e00cf

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lc/b/k/a;->a(Ljava/lang/CharSequence;)V

    .line 5
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCreate with url "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "packid.BadgeList"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const v1, 0x7f050026

    .line 6
    invoke-static {p0, v1}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v0, v2, :cond_1

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {p0, v1}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_1
    return-void
.end method

.method public final I()V
    .locals 3

    const v0, 0x7f080061

    .line 1
    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->C:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->E:Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v1, 0x3

    .line 3
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->j(I)V

    .line 4
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->E:Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Z)V

    .line 5
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->C:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    .line 6
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->C:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->E:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 7
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->C:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/orange/hce/proto/activity/BadgeListActivity$e;

    invoke-direct {v1, p0}, Lcom/orange/hce/proto/activity/BadgeListActivity$e;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView$t;)V

    const v0, 0x7f080158

    .line 8
    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    new-instance v0, Le/h/b/a/l/y0;

    invoke-direct {v0, p0}, Le/h/b/a/l/y0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->q:Le/h/b/a/l/y0;

    .line 11
    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->C:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    const v0, 0x7f080146

    .line 12
    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->u:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 13
    new-instance v1, Le/h/b/a/l/f;

    invoke-direct {v1, p0}, Le/h/b/a/l/f;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    return-void
.end method

.method public final J()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.orange.oab.packid.ble"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f080192

    .line 3
    invoke-virtual {p0, v1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/LinearLayoutCompat;

    iput-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->F:Landroidx/appcompat/widget/LinearLayoutCompat;

    const v1, 0x7f080191

    .line 4
    invoke-virtual {p0, v1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->G:Landroid/widget/TextView;

    .line 5
    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->F:Landroidx/appcompat/widget/LinearLayoutCompat;

    new-instance v2, Le/h/b/a/l/i;

    invoke-direct {v2, p0, v0}, Le/h/b/a/l/i;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public K()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->E:Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->i(I)V

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->C:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Le/h/b/a/l/h;

    invoke-direct {v1, p0}, Le/h/b/a/l/h;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final L()V
    .locals 1

    .line 1
    new-instance v0, Le/h/b/a/l/e;

    invoke-direct {v0, p0}, Le/h/b/a/l/e;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final M()V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/orange/hce/proto/activity/PermissionsActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final N()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->q:Le/h/b/a/l/y0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le/h/b/a/l/y0;->b(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->A:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 3
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->A:Landroid/os/Handler;

    new-instance v1, Le/h/b/a/l/k;

    invoke-direct {v1, p0}, Le/h/b/a/l/k;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public O()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->getBluetoothState(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0xc

    if-ne v3, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 3
    :goto_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v4, :cond_2

    const-string v2, "power"

    .line 4
    invoke-virtual {p0, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/PowerManager;

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    move-result v2

    .line 6
    :cond_2
    iget-object v3, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->q:Le/h/b/a/l/y0;

    invoke-virtual {v3, v0, v1, v2}, Le/h/b/a/l/y0;->a(ZZZ)V

    if-nez v0, :cond_3

    .line 7
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->u()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/Snackbar;->l()V

    goto :goto_2

    .line 8
    :cond_3
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->u()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/Snackbar;->b()V

    :goto_2
    return-void
.end method

.method public a()V
    .locals 2

    .line 39
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->F:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 40
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->F:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final a(Landroid/app/AlertDialog;)V
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Landroid/app/AlertDialog;)V

    .line 18
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->y()Z

    move-result p1

    if-nez p1, :cond_0

    .line 19
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->L()V

    :cond_0
    return-void
.end method

.method public synthetic a(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V

    return-void
.end method

.method public synthetic a(Landroid/net/Uri;)V
    .locals 1

    .line 27
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/orange/business/packid/android/lib/PackId;->register(Landroid/net/Uri;)V

    return-void
.end method

.method public a(Landroid/view/Menu;)V
    .locals 2

    const v0, 0x7f080107

    .line 20
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    .line 21
    new-instance v0, Landroid/widget/ImageButton;

    invoke-direct {v0, p0}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->B:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 23
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->B:Landroid/widget/ImageButton;

    const v1, 0x7f0700ba

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 24
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->B:Landroid/widget/ImageButton;

    new-instance v1, Le/h/b/a/l/l;

    invoke-direct {v1, p0}, Le/h/b/a/l/l;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->B:Landroid/widget/ImageButton;

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    return-void
.end method

.method public synthetic a(Landroid/view/View;)V
    .locals 1

    .line 26
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/orange/hce/proto/activity/QrCodeActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public a(Le/h/b/a/m/d;)V
    .locals 3

    .line 28
    new-instance v0, Landroid/content/Intent;

    invoke-static {p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Le/h/b/a/m/d;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 29
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "BADGE"

    .line 30
    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 31
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 32
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public a(Le/h/b/a/m/d;Ljava/lang/Boolean;)V
    .locals 2

    .line 33
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {p1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->saveAutorisedValue(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Z)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .line 34
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->F:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 35
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->F:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 36
    :cond_0
    invoke-virtual {p0}, Lc/b/k/r;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0e00d4

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_1

    .line 37
    invoke-virtual {p0}, Lc/b/k/r;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0e00d3

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v1

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 38
    :cond_1
    iget-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->G:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/String;Landroid/view/View;)V
    .locals 3

    const-string p2, "android.intent.action.VIEW"

    .line 5
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "market://details?id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 6
    :catch_0
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://play.google.com/store/apps/details?id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/User;",
            ">;)V"
        }
    .end annotation

    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 12
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 13
    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Subscribe to topic "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "packid.BadgeList"

    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->c()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->a(Ljava/lang/String;)Le/f/a/b/h/g;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final a(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 7
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->t()V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->v()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->l()V

    :goto_0
    return-void
.end method

.method public final a(ZZ)V
    .locals 0

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->v()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->l()V

    goto :goto_1

    .line 10
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->t()V

    :goto_1
    return-void
.end method

.method public final b(Landroid/app/AlertDialog;)V
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->t:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public synthetic b(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 20
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->F()V

    .line 21
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->L()V

    return-void
.end method

.method public synthetic b(Landroid/view/View;)V
    .locals 0

    .line 7
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->M()V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .line 17
    new-instance v0, Le/h/b/a/l/p;

    invoke-direct {v0, p0}, Le/h/b/a/l/p;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    .line 18
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const v1, 0x7f0e0064

    invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Landroid/app/AlertDialog;)V

    return-void
.end method

.method public final b(Z)V
    .locals 4

    .line 10
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;

    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Ljava/util/List;)V

    .line 12
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const-string v2, "packid.BadgeList"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->isDefault()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const-string p1, "refreshUsers recreate default user"

    .line 13
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    new-instance p1, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {p1, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/orange/business/packid/android/lib/PackId;->createDefaultUser()Lcom/orange/oab/contactless/packid/hce/user/User;

    goto :goto_0

    :cond_0
    const-string p1, "refreshUsers update users"

    .line 15
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    new-instance p1, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {p1, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "PackIdLibFirebaseMessagingService"

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "token"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v3, v0}, Lcom/orange/business/packid/android/lib/PackId;->update(ZLjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final b(ZZ)V
    .locals 0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 8
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->t()V

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->v()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->l()V

    :goto_0
    return-void
.end method

.method public synthetic c(Landroid/view/View;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->M()V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 4
    new-instance v0, Le/h/b/a/l/j;

    invoke-direct {v0, p0}, Le/h/b/a/l/j;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    .line 5
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const v1, 0x7f0e0064

    invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 6
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Landroid/app/AlertDialog;)V

    return-void
.end method

.method public c(Z)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->q:Le/h/b/a/l/y0;

    invoke-virtual {v0, p1}, Le/h/b/a/l/y0;->a(Z)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lc/l/d/f0;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    if-eqz p3, :cond_0

    .line 2
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0, p3}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "packid.BadgeList"

    const-string v1, "onCreate"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b001d

    .line 3
    invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(I)V

    const p1, 0x7f080040

    .line 4
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->y:Landroid/view/View;

    .line 5
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->H()V

    .line 6
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->J()V

    .line 7
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->I()V

    .line 8
    iget-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->r:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 9
    iget-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->s:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.nfc.action.ADAPTER_STATE_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 10
    new-instance p1, Le/h/b/a/n/f;

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->q:Le/h/b/a/l/y0;

    invoke-direct {p1, v1}, Le/h/b/a/n/f;-><init>(Le/h/b/a/l/y0;)V

    iput-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->H:Le/h/b/a/n/f;

    .line 11
    new-instance p1, Le/h/b/a/n/d;

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->q:Le/h/b/a/l/y0;

    invoke-direct {p1, v1}, Le/h/b/a/n/d;-><init>(Le/h/b/a/l/y0;)V

    iput-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->M:Le/h/b/a/n/d;

    .line 12
    new-instance p1, Le/h/b/a/n/e;

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->q:Le/h/b/a/l/y0;

    invoke-direct {p1, v1}, Le/h/b/a/n/e;-><init>(Le/h/b/a/l/y0;)V

    iput-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->N:Le/h/b/a/n/e;

    .line 13
    iget-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->u:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 14
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->A:Landroid/os/Handler;

    const-string p1, "onCreate done"

    .line 15
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const/high16 v1, 0x7f0c0000

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Landroid/view/Menu;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->r:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->s:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->w:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    .line 4
    invoke-super {p0}, Lc/b/k/r;->onDestroy()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f0800a9

    const/4 v2, 0x1

    if-eq v0, v1, :cond_2

    const v1, 0x7f0800cb

    if-eq v0, v1, :cond_1

    const v1, 0x7f080107

    if-eq v0, v1, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/orange/hce/proto/activity/QrCodeActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return v2

    .line 4
    :cond_1
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/orange/hce/proto/activity/LegalInformationActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return v2

    .line 5
    :cond_2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->K()V

    return v2
.end method

.method public onPause()V
    .locals 2

    const-string v0, "packid.BadgeList"

    const-string v1, "onPause"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->v:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    .line 3
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->K:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    .line 4
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->L:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    .line 5
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->H:Le/h/b/a/n/f;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    .line 6
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->N:Le/h/b/a/n/e;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    .line 7
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->M:Le/h/b/a/n/d;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    .line 8
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->stopBroadcastRSSILevel()V

    .line 9
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->A:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 10
    invoke-super {p0}, Lc/l/d/f0;->onPause()V

    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    const v0, 0x7f080193

    .line 1
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->w()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 2
    invoke-super {p0, p1}, Landroid/app/Activity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1
    array-length p1, p2

    if-lez p1, :cond_0

    const/4 p1, 0x0

    aget-object p2, p2, p1

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 2
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    array-length p2, p3

    if-lez p2, :cond_0

    aget p1, p3, p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    .line 3
    invoke-static {p0, v0}, Lc/h/e/f;->a(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "packid.BadgeList"

    const-string p2, "User checked \'do not ask again\' when asked for permission"

    .line 4
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onResume()V

    .line 2
    new-instance v0, Le/h/b/a/p/d;

    invoke-direct {v0, p0, p0}, Le/h/b/a/p/d;-><init>(Landroid/content/Context;Le/h/b/a/p/c;)V

    .line 3
    invoke-virtual {v0}, Le/h/b/a/p/d;->a()V

    .line 4
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->v:Landroid/content/BroadcastReceiver;

    sget-object v2, Le/h/b/a/p/l;->a:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 5
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->w:Landroid/content/BroadcastReceiver;

    sget-object v2, Le/h/b/a/p/l;->b:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 6
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->x()V

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/orange/hce/proto/PackIdApp;

    invoke-virtual {v0}, Lcom/orange/hce/proto/PackIdApp;->a()Lcom/orange/business/packid/android/lib/PackId;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->start()V

    .line 9
    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->hasBleBadges()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->z:Z

    .line 11
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->s()V

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->startBroadcastRSSILevel()V

    .line 13
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->K:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_LEVEL_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 14
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->L:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_BUTTON_IN_RANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 15
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->H:Le/h/b/a/n/f;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 16
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->M:Le/h/b/a/n/d;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_LOCKED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 17
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->N:Le/h/b/a/n/e;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_UNLOCKED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 18
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->G()V

    .line 19
    invoke-virtual {p0}, Lc/b/k/r;->invalidateOptionsMenu()V

    return-void
.end method

.method public final s()V
    .locals 4

    const/4 v0, 0x0

    const-string v1, "BadgeListActivity"

    .line 1
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "hasSeePermissionsActivity"

    const/4 v3, 0x1

    .line 2
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->M()V

    .line 4
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 5
    :cond_0
    sget v0, Lcom/orange/hce/proto/activity/BadgeListActivity;->O:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    const-string v0, "android.permission.BLUETOOTH_CONNECT"

    .line 6
    invoke-static {p0, v0}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    const-string v1, "android.permission.BLUETOOTH_SCAN"

    .line 7
    invoke-static {p0, v1}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    .line 8
    invoke-virtual {p0, v0, v1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(ZZ)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-gt v0, v1, :cond_2

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 9
    invoke-static {p0, v0}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Z)V

    goto :goto_0

    :cond_2
    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 10
    invoke-static {p0, v0}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    const-string v1, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 11
    invoke-static {p0, v1}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    .line 12
    invoke-virtual {p0, v0, v1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(ZZ)V

    :goto_0
    return-void
.end method

.method public final t()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->isBluetoothEnabled(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->u()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/Snackbar;->l()V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->O()V

    return-void
.end method

.method public final u()Lcom/google/android/material/snackbar/Snackbar;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->I:Lcom/google/android/material/snackbar/Snackbar;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->y:Landroid/view/View;

    const v1, 0x7f0e0058

    const/4 v2, -0x2

    invoke-static {v0, v1, v2}, Lcom/google/android/material/snackbar/Snackbar;->a(Landroid/view/View;II)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->I:Lcom/google/android/material/snackbar/Snackbar;

    const v1, 0x7f0e0024

    .line 3
    new-instance v2, Le/h/b/a/l/g;

    invoke-direct {v2, p0}, Le/h/b/a/l/g;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/snackbar/Snackbar;->a(ILandroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->I:Lcom/google/android/material/snackbar/Snackbar;

    return-object v0
.end method

.method public final v()Lcom/google/android/material/snackbar/Snackbar;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->J:Lcom/google/android/material/snackbar/Snackbar;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->y:Landroid/view/View;

    const v1, 0x7f0e0144

    const/4 v2, -0x2

    invoke-static {v0, v1, v2}, Lcom/google/android/material/snackbar/Snackbar;->a(Landroid/view/View;II)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->J:Lcom/google/android/material/snackbar/Snackbar;

    const v1, 0x7f0e0039

    .line 3
    new-instance v2, Le/h/b/a/l/n;

    invoke-direct {v2, p0}, Le/h/b/a/l/n;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/snackbar/Snackbar;->a(ILandroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->J:Lcom/google/android/material/snackbar/Snackbar;

    return-object v0
.end method

.method public final w()Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 2
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const v0, 0x7f0e0167

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t get version name, default to : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "packid.BadgeList"

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method public final x()V
    .locals 4

    const-string v0, "packid.BadgeList"

    const-string v1, "initializeUsers"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Le/h/b/a/p/n;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->clear()V

    .line 4
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->N()V

    const v0, 0x7f0e0130

    .line 5
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initializeUsers with url "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", registering"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const v0, 0x7f0e00c0

    .line 9
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f0e0118

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->x:Landroid/app/ProgressDialog;

    .line 10
    new-instance v0, Ljava/lang/Thread;

    new-instance v2, Le/h/b/a/l/o;

    invoke-direct {v2, p0, v1}, Le/h/b/a/l/o;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;Landroid/net/Uri;)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :cond_1
    const-string v1, "initializeUsers no URL, showing current badges and refreshing"

    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->N()V

    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Z)V

    :goto_0
    return-void
.end method

.method public final y()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/AlertDialog;

    .line 2
    invoke-virtual {v1}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic z()V
    .locals 3

    const-string v0, "packid.BadgeList"

    const-string v1, "scheduleShowcaseDisplay"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->q:Le/h/b/a/l/y0;

    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->B:Landroid/widget/ImageButton;

    iget-object v2, p0, Lcom/orange/hce/proto/activity/BadgeListActivity;->C:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, v1, v2}, Le/h/b/a/k;->a(Le/h/b/a/l/y0;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method
