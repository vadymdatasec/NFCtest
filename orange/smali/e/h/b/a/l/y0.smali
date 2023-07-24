.class public Le/h/b/a/l/y0;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/h/b/a/l/y0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "Landroidx/recyclerview/widget/RecyclerView$d0;",
        ">;"
    }
.end annotation


# instance fields
.field public c:Landroid/content/Context;

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/h/b/a/m/d;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/h/b/a/m/d;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/h/b/a/m/d;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Le/h/b/a/l/y0$a;

.field public h:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Le/h/b/a/m/d;",
            "Ljava/util/Timer;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Landroid/os/Handler;

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Le/h/b/a/l/y0;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    iput-object p1, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/h/b/a/l/y0;->d:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/h/b/a/l/y0;->e:Ljava/util/List;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    .line 7
    instance-of v0, p1, Le/h/b/a/l/y0$a;

    if-eqz v0, :cond_0

    .line 8
    move-object v0, p1

    check-cast v0, Le/h/b/a/l/y0$a;

    iput-object v0, p0, Le/h/b/a/l/y0;->g:Le/h/b/a/l/y0$a;

    .line 9
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Le/h/b/a/l/y0;->i:Landroid/os/Handler;

    return-void

    .line 10
    :cond_0
    new-instance p1, Lcom/orange/hce/proto/util/PackIdRuntimeException;

    const-string v0, "Context must implement the BadgeRecyclerViewAdapter.OnListInteractionListener"

    invoke-direct {p1, v0}, Lcom/orange/hce/proto/util/PackIdRuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Le/h/b/a/l/y0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/h/b/a/l/y0;->d()V

    return-void
.end method

.method public static a(Landroid/content/Context;Le/h/b/a/m/d;)Z
    .locals 2

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string p1, "isFavorite"

    .line 75
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 2
    iget-object v0, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/m/d;
    .locals 3

    .line 93
    iget-object v0, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/h/b/a/m/d;

    .line 94
    invoke-virtual {p0, p1, p2, v1}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Le/h/b/a/m/d;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Le/h/b/a/m/d;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/h/b/a/m/d;",
            ")",
            "Ljava/util/List<",
            "Le/h/b/a/m/d;",
            ">;"
        }
    .end annotation

    .line 76
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 77
    iget-object v1, p0, Le/h/b/a/l/y0;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/h/b/a/m/d;

    .line 78
    invoke-virtual {p0, p1, v2}, Le/h/b/a/l/y0;->b(Le/h/b/a/m/d;Le/h/b/a/m/d;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 79
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public a(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/h/b/a/m/d;",
            ">;)",
            "Ljava/util/List<",
            "Le/h/b/a/m/d;",
            ">;"
        }
    .end annotation

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 81
    iget-object v1, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/h/b/a/m/d;

    .line 82
    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 83
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "delete:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "packid.badgeAdapter"

    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public synthetic a(Landroid/content/SharedPreferences;Landroid/view/View;)V
    .locals 1

    .line 61
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    check-cast p2, Lcom/orange/hce/proto/activity/StateImageButton;

    invoke-virtual {p2}, Lcom/orange/hce/proto/activity/StateImageButton;->getActive()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const-string v0, "isFavorite"

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 62
    invoke-virtual {p0}, Le/h/b/a/l/y0;->e()V

    return-void
.end method

.method public synthetic a(Landroid/os/Vibrator;Le/h/b/a/m/d;Landroid/view/View;)V
    .locals 2

    const-wide/16 v0, 0x96

    .line 51
    invoke-virtual {p1, v0, v1}, Landroid/os/Vibrator;->vibrate(J)V

    .line 52
    new-instance p1, Lcom/orange/business/packid/android/lib/PackId;

    iget-object p3, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    invoke-direct {p1, p3}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object p3

    invoke-virtual {p2}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Lcom/orange/business/packid/android/lib/PackId;->startBleTransaction(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    .line 53
    sget-object p1, Le/h/b/a/m/i;->g:Le/h/b/a/m/i;

    const/16 p3, 0x2710

    invoke-virtual {p0, p2, p1, p3}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V

    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 3

    .line 85
    iget-object p1, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    const-class v2, Lcom/orange/hce/proto/activity/PermissionsActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final a(Landroidx/constraintlayout/widget/ConstraintLayout;I)V
    .locals 5

    const v0, 0x7f080194

    .line 23
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 24
    new-instance v1, Lc/f/b/f;

    invoke-direct {v1}, Lc/f/b/f;-><init>()V

    .line 25
    invoke-virtual {v1, p1}, Lc/f/b/f;->c(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4, v3}, Lc/f/b/f;->a(IIII)V

    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v2, 0x4

    invoke-virtual {v1, v0, v2, p2, v2}, Lc/f/b/f;->a(IIII)V

    .line 28
    invoke-virtual {v1, p1}, Lc/f/b/f;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    return-void
.end method

.method public final a(Landroidx/recyclerview/widget/RecyclerView$d0;Le/h/b/a/m/d;)V
    .locals 4

    .line 3
    move-object v0, p1

    check-cast v0, Le/h/b/a/m/e;

    .line 4
    invoke-virtual {v0}, Le/h/b/a/m/e;->S()V

    .line 5
    invoke-virtual {p0, v0, p2}, Le/h/b/a/l/y0;->b(Le/h/b/a/m/e;Le/h/b/a/m/d;)V

    .line 6
    invoke-virtual {v0}, Le/h/b/a/m/e;->H()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {p2}, Le/h/b/a/m/d;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    invoke-virtual {v0}, Le/h/b/a/m/e;->Q()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {p2, v1}, Le/h/b/a/m/d;->a(Landroid/widget/TextView;)V

    .line 8
    invoke-virtual {v0}, Le/h/b/a/m/e;->F()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {p2}, Le/h/b/a/m/d;->c()Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    move-result-object v2

    sget-object v3, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->none:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/16 v2, 0x8

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    invoke-virtual {v0}, Le/h/b/a/m/e;->D()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {p2}, Le/h/b/a/m/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    invoke-virtual {v0}, Le/h/b/a/m/e;->E()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {p2, v1}, Le/h/b/a/m/d;->d(Landroid/widget/ImageView;)V

    .line 11
    invoke-virtual {v0}, Le/h/b/a/m/e;->E()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    invoke-virtual {v0}, Le/h/b/a/m/e;->K()Landroid/widget/ImageButton;

    move-result-object v1

    new-instance v2, Le/h/b/a/l/u;

    invoke-direct {v2, p0, p2}, Le/h/b/a/l/u;-><init>(Le/h/b/a/l/y0;Le/h/b/a/m/d;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    invoke-virtual {p0, v0, p2}, Le/h/b/a/l/y0;->e(Le/h/b/a/m/e;Le/h/b/a/m/d;)V

    .line 14
    invoke-virtual {p0, v0, p2}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/e;Le/h/b/a/m/d;)V

    .line 15
    invoke-virtual {p0, v0, p2}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/e;Le/h/b/a/m/d;)V

    .line 16
    invoke-virtual {p0, p2, v0}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Le/h/b/a/m/e;)V

    .line 17
    invoke-virtual {v0}, Le/h/b/a/m/e;->C()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setActivated(Z)V

    .line 18
    invoke-virtual {p0, p2, v0}, Le/h/b/a/l/y0;->b(Le/h/b/a/m/d;Le/h/b/a/m/e;)V

    .line 19
    invoke-virtual {p2}, Le/h/b/a/m/d;->v()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 20
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->a:Landroid/view/View;

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    const p2, 0x7f0800ad

    invoke-virtual {p0, p1, p2}, Le/h/b/a/l/y0;->a(Landroidx/constraintlayout/widget/ConstraintLayout;I)V

    goto :goto_1

    .line 21
    :cond_1
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->a:Landroid/view/View;

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p0, p1, v3}, Le/h/b/a/l/y0;->a(Landroidx/constraintlayout/widget/ConstraintLayout;I)V

    :goto_1
    return-void
.end method

.method public a(Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 2

    .line 95
    invoke-virtual {p0, p2, p3}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/m/d;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 96
    :cond_0
    iget-object p3, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p3

    .line 97
    invoke-virtual {p2}, Le/h/b/a/m/d;->p()Le/h/b/a/m/i;

    move-result-object v0

    .line 98
    sget-object v1, Le/h/b/a/l/x0;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 p5, 0x2

    const/16 v1, 0xbb8

    if-eq p1, p5, :cond_2

    const/4 p4, 0x3

    if-eq p1, p4, :cond_1

    const/4 p4, 0x4

    if-eq p1, p4, :cond_1

    const/4 p4, 0x5

    if-eq p1, p4, :cond_1

    goto :goto_0

    .line 99
    :cond_1
    invoke-virtual {p2, p6}, Le/h/b/a/m/d;->b(Ljava/lang/String;)V

    .line 100
    sget-object p1, Le/h/b/a/m/i;->e:Le/h/b/a/m/i;

    invoke-virtual {p1, p6}, Le/h/b/a/m/i;->a(Ljava/lang/String;)Le/h/b/a/m/i;

    invoke-virtual {p0, p2, p1, v1}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V

    goto :goto_0

    .line 101
    :cond_2
    invoke-virtual {p2, p6}, Le/h/b/a/m/d;->b(Ljava/lang/String;)V

    .line 102
    sget-object p1, Le/h/b/a/m/i;->f:Le/h/b/a/m/i;

    invoke-virtual {p1, p6}, Le/h/b/a/m/i;->a(Ljava/lang/String;)Le/h/b/a/m/i;

    invoke-virtual {p0, p2, p1, v1}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V

    .line 103
    invoke-virtual {p0, p4, p2}, Le/h/b/a/l/y0;->a(Ljava/lang/String;Le/h/b/a/m/d;)V

    goto :goto_0

    .line 104
    :cond_3
    sget-object p1, Le/h/b/a/m/i;->g:Le/h/b/a/m/i;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result p4

    add-int/lit16 p4, p4, 0x3e8

    invoke-virtual {p0, p2, p1, p4}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V

    .line 105
    :goto_0
    invoke-virtual {p2}, Le/h/b/a/m/d;->p()Le/h/b/a/m/i;

    move-result-object p1

    if-eq v0, p1, :cond_4

    .line 106
    invoke-virtual {p0, p3, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->a(ILjava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public synthetic a(Le/h/b/a/m/d;Landroid/view/View;)V
    .locals 0

    .line 22
    iget-object p2, p0, Le/h/b/a/l/y0;->g:Le/h/b/a/l/y0$a;

    invoke-interface {p2, p1}, Le/h/b/a/l/y0$a;->a(Le/h/b/a/m/d;)V

    return-void
.end method

.method public synthetic a(Le/h/b/a/m/d;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 49
    check-cast p3, Lcom/orange/hce/proto/activity/StateImageButton;

    invoke-virtual {p3}, Lcom/orange/hce/proto/activity/StateImageButton;->getActive()Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-virtual {p1, p3}, Le/h/b/a/m/d;->b(Z)V

    .line 50
    invoke-virtual {p0, p1, p2}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/d;Landroid/view/View;)V

    return-void
.end method

.method public final a(Le/h/b/a/m/d;Le/h/b/a/m/d;)V
    .locals 2

    .line 63
    invoke-virtual {p0, p1}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "customizableDevice"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 64
    invoke-static {p1}, Le/h/b/a/p/i;->c(Ljava/lang/String;)Le/h/b/a/p/i;

    move-result-object p1

    invoke-virtual {p2, p1}, Le/h/b/a/m/d;->a(Le/h/b/a/p/i;)V

    :cond_0
    return-void
.end method

.method public final a(Le/h/b/a/m/d;Le/h/b/a/m/e;)V
    .locals 3

    .line 29
    invoke-virtual {p2}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object v0

    iget-object v1, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    const v2, 0x7f07009d

    invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 30
    invoke-virtual {p2}, Le/h/b/a/m/e;->N()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object v0

    iget-object v1, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    const v2, 0x7f0700b4

    invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 31
    iget-object v0, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    invoke-virtual {p1, v0}, Le/h/b/a/m/d;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    invoke-virtual {p0, p2}, Le/h/b/a/l/y0;->b(Le/h/b/a/m/e;)V

    .line 33
    :cond_0
    iget-object v0, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    invoke-virtual {p1, v0}, Le/h/b/a/m/d;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 34
    invoke-virtual {p0, p2, p1}, Le/h/b/a/l/y0;->d(Le/h/b/a/m/e;Le/h/b/a/m/d;)V

    .line 35
    invoke-virtual {p0, p2}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/e;)V

    :cond_1
    return-void
.end method

.method public final a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V
    .locals 1

    .line 54
    invoke-virtual {p1, p2}, Le/h/b/a/m/d;->a(Le/h/b/a/m/i;)V

    .line 55
    iget-object p2, p0, Le/h/b/a/l/y0;->h:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Le/h/b/a/l/w0;

    invoke-direct {v0, p0, p1}, Le/h/b/a/l/w0;-><init>(Le/h/b/a/l/y0;Le/h/b/a/m/d;)V

    invoke-virtual {p0, p1, p2, p3, v0}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Ljava/util/concurrent/ConcurrentHashMap;ILjava/util/TimerTask;)V

    return-void
.end method

.method public final a(Le/h/b/a/m/d;Ljava/util/concurrent/ConcurrentHashMap;ILjava/util/TimerTask;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/h/b/a/m/d;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Le/h/b/a/m/d;",
            "Ljava/util/Timer;",
            ">;I",
            "Ljava/util/TimerTask;",
            ")V"
        }
    .end annotation

    .line 56
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 58
    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    int-to-long v1, p3

    .line 59
    invoke-virtual {v0, p4, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 60
    invoke-virtual {p2, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Le/h/b/a/m/e;)V
    .locals 3

    .line 36
    invoke-virtual {p1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object v0

    iget-boolean v1, p0, Le/h/b/a/l/y0;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/hce/proto/activity/StateImageButton;->setActive(Ljava/lang/Boolean;)V

    .line 37
    iget-boolean v0, p0, Le/h/b/a/l/y0;->k:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Le/h/b/a/l/y0;->l:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 38
    :goto_0
    iget-boolean v1, p0, Le/h/b/a/l/y0;->j:Z

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 39
    invoke-virtual {p1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object v0

    iget-object v1, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    const v2, 0x7f07009c

    invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 40
    :cond_1
    iget-boolean v0, p0, Le/h/b/a/l/y0;->j:Z

    if-eqz v0, :cond_2

    .line 41
    invoke-virtual {p1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object v0

    iget-object v1, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    const v2, 0x7f07009e

    invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {p1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object v0

    iget-object v1, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    const v2, 0x7f07009d

    invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 43
    :goto_1
    invoke-virtual {p1}, Le/h/b/a/m/e;->G()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object p1

    new-instance v0, Le/h/b/a/l/v;

    invoke-direct {v0, p0}, Le/h/b/a/l/v;-><init>(Le/h/b/a/l/y0;)V

    invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setOnClickListenerWitoutChangingState(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final a(Le/h/b/a/m/e;Le/h/b/a/m/d;)V
    .locals 2

    .line 44
    invoke-virtual {p1}, Le/h/b/a/m/e;->C()Landroid/view/View;

    move-result-object v0

    .line 45
    invoke-virtual {p1}, Le/h/b/a/m/e;->M()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object p1

    .line 46
    invoke-virtual {p2}, Le/h/b/a/m/d;->u()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/orange/hce/proto/activity/StateImageButton;->setActive(Ljava/lang/Boolean;)V

    .line 47
    invoke-virtual {p0, p2, v0}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/d;Landroid/view/View;)V

    .line 48
    new-instance v1, Le/h/b/a/l/t;

    invoke-direct {v1, p0, p2, v0}, Le/h/b/a/l/t;-><init>(Le/h/b/a/l/y0;Le/h/b/a/m/d;Landroid/view/View;)V

    invoke-virtual {p1, v1}, Lcom/orange/hce/proto/activity/StateImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;I)V
    .locals 3

    .line 115
    iget-object v0, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/h/b/a/m/d;

    .line 116
    invoke-virtual {p0, p1, p2, v1}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Le/h/b/a/m/d;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 117
    iget-object p1, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    .line 118
    invoke-static {}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->values()[Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    move-result-object p2

    aget-object p2, p2, p3

    invoke-virtual {v1, p2}, Le/h/b/a/m/d;->a(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V

    .line 119
    invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$g;->a(ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Z)V
    .locals 3

    .line 120
    iget-object v0, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/h/b/a/m/d;

    .line 121
    invoke-virtual {p0, p1, p2, v1}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Le/h/b/a/m/d;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 122
    iget-object p1, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    .line 123
    invoke-virtual {v1, p3}, Le/h/b/a/m/d;->a(Z)V

    .line 124
    invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$g;->a(ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;Le/h/b/a/m/d;)V
    .locals 2

    .line 107
    invoke-virtual {p2}, Le/h/b/a/m/d;->t()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 108
    :cond_0
    invoke-static {p1}, Le/h/b/a/p/i;->b(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "customizableDevice"

    if-eqz v0, :cond_1

    .line 109
    invoke-virtual {p0, p2}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 110
    invoke-static {p1}, Le/h/b/a/p/i;->c(Ljava/lang/String;)Le/h/b/a/p/i;

    move-result-object p1

    invoke-virtual {p2, p1}, Le/h/b/a/m/d;->a(Le/h/b/a/p/i;)V

    goto :goto_0

    .line 111
    :cond_1
    invoke-virtual {p0, p2}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 p1, 0x0

    .line 112
    invoke-virtual {p2, p1}, Le/h/b/a/m/d;->a(Le/h/b/a/p/i;)V

    :goto_0
    const/4 p1, 0x0

    .line 113
    invoke-virtual {p0, p1}, Le/h/b/a/l/y0;->b(Z)Z

    return-void
.end method

.method public a(Ljava/util/List;Ljava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/h/b/a/m/d;",
            ">;",
            "Ljava/util/List<",
            "Le/h/b/a/m/d;",
            ">;Z)V"
        }
    .end annotation

    .line 65
    iput-object p1, p0, Le/h/b/a/l/y0;->d:Ljava/util/List;

    .line 66
    iput-object p2, p0, Le/h/b/a/l/y0;->e:Ljava/util/List;

    .line 67
    invoke-virtual {p0, p2}, Le/h/b/a/l/y0;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 68
    iget-object v0, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    const/4 v0, 0x0

    .line 69
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 70
    iget-object v1, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 71
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "add:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "packid.badgeAdapter"

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    iget-object p1, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/h/b/a/m/d;

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    if-eqz p3, :cond_3

    .line 73
    :cond_2
    invoke-virtual {p0}, Le/h/b/a/l/y0;->e()V

    :cond_3
    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 90
    iget-boolean v0, p0, Le/h/b/a/l/y0;->m:Z

    if-eq v0, p1, :cond_0

    .line 91
    iput-boolean p1, p0, Le/h/b/a/l/y0;->m:Z

    .line 92
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->c()V

    :cond_0
    return-void
.end method

.method public a(ZZZ)V
    .locals 0

    .line 86
    iput-boolean p3, p0, Le/h/b/a/l/y0;->l:Z

    .line 87
    iput-boolean p2, p0, Le/h/b/a/l/y0;->k:Z

    .line 88
    iput-boolean p1, p0, Le/h/b/a/l/y0;->j:Z

    .line 89
    invoke-virtual {p0}, Le/h/b/a/l/y0;->d()V

    return-void
.end method

.method public a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Le/h/b/a/m/d;)Z
    .locals 2

    .line 114
    invoke-virtual {p3}, Le/h/b/a/m/d;->q()Le/h/b/a/m/a;

    move-result-object v0

    sget-object v1, Le/h/b/a/m/a;->b:Le/h/b/a/m/a;

    if-ne v0, v1, :cond_0

    invoke-virtual {p3}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(I)I
    .locals 1

    .line 10
    iget-object v0, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/h/b/a/m/d;

    invoke-virtual {p1}, Le/h/b/a/m/d;->q()Le/h/b/a/m/a;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    return p1
.end method

.method public b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)I
    .locals 1

    .line 78
    invoke-virtual {p0, p1, p2}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/m/d;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 79
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Badge "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le/h/b/a/m/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " locked"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "packid.badgeAdapter"

    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p2, 0x1

    .line 80
    invoke-virtual {p1, p2}, Le/h/b/a/m/d;->d(Z)V

    .line 81
    :cond_0
    iget-object p2, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public b(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 2
    sget-object v1, Le/h/b/a/m/a;->d:Le/h/b/a/m/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x0

    if-ne p2, v1, :cond_0

    const p2, 0x7f0b0025

    .line 3
    invoke-virtual {v0, p2, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 4
    new-instance p2, Le/h/b/a/m/f;

    invoke-direct {p2, p1}, Le/h/b/a/m/f;-><init>(Landroid/view/View;)V

    return-object p2

    .line 5
    :cond_0
    sget-object v1, Le/h/b/a/m/a;->c:Le/h/b/a/m/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne p2, v1, :cond_1

    const p2, 0x7f0b0044

    .line 6
    invoke-virtual {v0, p2, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 7
    new-instance p2, Le/h/b/a/m/g;

    invoke-direct {p2, p1}, Le/h/b/a/m/g;-><init>(Landroid/view/View;)V

    return-object p2

    :cond_1
    const p2, 0x7f0b0026

    .line 8
    invoke-virtual {v0, p2, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 9
    new-instance p2, Le/h/b/a/m/e;

    invoke-direct {p2, p1}, Le/h/b/a/m/e;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public b(Le/h/b/a/m/d;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/h/b/a/m/d;",
            ")",
            "Ljava/util/List<",
            "Le/h/b/a/m/d;",
            ">;"
        }
    .end annotation

    .line 70
    invoke-virtual {p0, p1}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;)Ljava/util/List;

    move-result-object p1

    .line 71
    invoke-virtual {p0, p1}, Le/h/b/a/l/y0;->b(Ljava/util/List;)V

    return-object p1
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 2

    .line 11
    iget-object v0, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le/h/b/a/m/d;

    .line 12
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->i()I

    move-result v0

    sget-object v1, Le/h/b/a/m/a;->b:Le/h/b/a/m/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 13
    invoke-virtual {p0, p1, p2}, Le/h/b/a/l/y0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;Le/h/b/a/m/d;)V

    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->i()I

    move-result v0

    sget-object v1, Le/h/b/a/m/a;->d:Le/h/b/a/m/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 15
    invoke-virtual {p0, p1, p2}, Le/h/b/a/l/y0;->b(Landroidx/recyclerview/widget/RecyclerView$d0;Le/h/b/a/m/d;)V

    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p0, p1}, Le/h/b/a/l/y0;->e(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    :goto_0
    return-void
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView$d0;Le/h/b/a/m/d;)V
    .locals 2

    .line 22
    check-cast p1, Le/h/b/a/m/f;

    .line 23
    invoke-virtual {p1}, Le/h/b/a/m/f;->D()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Le/h/b/a/m/d;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    invoke-virtual {p2}, Le/h/b/a/m/d;->e()Le/h/b/a/p/i;

    move-result-object v0

    const v1, 0x7f0d0003

    if-eqz v0, :cond_0

    .line 25
    invoke-virtual {p2}, Le/h/b/a/m/d;->e()Le/h/b/a/p/i;

    move-result-object p2

    invoke-virtual {p2}, Le/h/b/a/p/i;->a()I

    move-result p2

    .line 26
    invoke-virtual {p1}, Le/h/b/a/m/f;->C()Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {v0}, Le/h/b/a/d;->a(Landroid/view/View;)Le/h/b/a/g;

    move-result-object v0

    .line 27
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Le/h/b/a/g;->a(Ljava/lang/Integer;)Le/h/b/a/f;

    move-result-object p2

    .line 28
    invoke-virtual {p2, v1}, Le/h/b/a/f;->b(I)Le/h/b/a/f;

    move-result-object p2

    .line 29
    invoke-virtual {p2}, Le/h/b/a/f;->b()Le/h/b/a/f;

    move-result-object p2

    sget-object v0, Le/b/a/y/x/c0;->c:Le/b/a/y/x/c0;

    .line 30
    invoke-virtual {p2, v0}, Le/h/b/a/f;->a(Le/b/a/y/x/c0;)Le/h/b/a/f;

    move-result-object p2

    .line 31
    invoke-virtual {p1}, Le/h/b/a/m/f;->C()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p2, p1}, Le/b/a/s;->a(Landroid/widget/ImageView;)Le/b/a/c0/o/k;

    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p1}, Le/h/b/a/m/f;->C()Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {v0}, Le/h/b/a/d;->a(Landroid/view/View;)Le/h/b/a/g;

    move-result-object v0

    .line 33
    invoke-virtual {p2}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object p2

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getLogoUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Le/h/b/a/g;->a(Ljava/lang/String;)Le/h/b/a/f;

    move-result-object p2

    .line 34
    invoke-virtual {p2, v1}, Le/h/b/a/f;->b(I)Le/h/b/a/f;

    move-result-object p2

    .line 35
    invoke-virtual {p2}, Le/h/b/a/f;->b()Le/h/b/a/f;

    move-result-object p2

    sget-object v0, Le/b/a/y/x/c0;->c:Le/b/a/y/x/c0;

    .line 36
    invoke-virtual {p2, v0}, Le/h/b/a/f;->a(Le/b/a/y/x/c0;)Le/h/b/a/f;

    move-result-object p2

    .line 37
    invoke-virtual {p1}, Le/h/b/a/m/f;->C()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p2, p1}, Le/b/a/s;->a(Landroid/widget/ImageView;)Le/b/a/c0/o/k;

    :goto_0
    return-void
.end method

.method public synthetic b(Le/h/b/a/m/d;Landroid/view/View;)V
    .locals 1

    .line 48
    iget-object v0, p0, Le/h/b/a/l/y0;->g:Le/h/b/a/l/y0$a;

    check-cast p2, Lcom/orange/hce/proto/activity/StateImageButton;

    invoke-virtual {p2}, Lcom/orange/hce/proto/activity/StateImageButton;->getActive()Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Le/h/b/a/l/y0$a;->a(Le/h/b/a/m/d;Ljava/lang/Boolean;)V

    return-void
.end method

.method public final b(Le/h/b/a/m/d;Le/h/b/a/m/e;)V
    .locals 1

    .line 17
    invoke-virtual {p1}, Le/h/b/a/m/d;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    invoke-virtual {p2}, Le/h/b/a/m/e;->L()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object v0

    invoke-virtual {p1}, Le/h/b/a/m/d;->x()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/orange/hce/proto/activity/StateImageButton;->setActive(Ljava/lang/Boolean;)V

    .line 19
    invoke-virtual {p2}, Le/h/b/a/m/e;->L()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 20
    invoke-virtual {p2}, Le/h/b/a/m/e;->L()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p2}, Le/h/b/a/m/e;->L()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public b(Le/h/b/a/m/e;)V
    .locals 2

    .line 38
    invoke-virtual {p1}, Le/h/b/a/m/e;->N()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 39
    invoke-virtual {p1}, Le/h/b/a/m/e;->N()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object p1

    iget-object v0, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->isNfcEnabled(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setActive(Ljava/lang/Boolean;)V

    return-void
.end method

.method public final b(Le/h/b/a/m/e;Le/h/b/a/m/d;)V
    .locals 4

    .line 40
    invoke-virtual {p2}, Le/h/b/a/m/d;->p()Le/h/b/a/m/i;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le/h/b/a/m/i;->a(Le/h/b/a/m/e;Le/h/b/a/m/d;)V

    .line 41
    invoke-virtual {p1}, Le/h/b/a/m/e;->E()Landroid/widget/ImageView;

    move-result-object p1

    .line 42
    iget-object v0, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->isBluetoothEnabled(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Le/h/b/a/m/d;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Le/h/b/a/m/d;->y()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const v0, 0x7f0700d8

    .line 43
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 44
    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "vibrator"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    .line 45
    invoke-virtual {p2}, Le/h/b/a/m/d;->p()Le/h/b/a/m/i;

    move-result-object v2

    sget-object v3, Le/h/b/a/m/i;->d:Le/h/b/a/m/i;

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Le/h/b/a/l/q;

    invoke-direct {v1, p0, v0, p2}, Le/h/b/a/l/q;-><init>(Le/h/b/a/l/y0;Landroid/os/Vibrator;Le/h/b/a/m/d;)V

    :goto_0
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    :goto_1
    const p2, 0x7f070062

    .line 46
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 47
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_2
    return-void
.end method

.method public final b(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/h/b/a/m/d;",
            ">;)V"
        }
    .end annotation

    .line 72
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 73
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/h/b/a/m/d;

    add-int/lit8 v2, v2, 0x1

    if-ne v2, v0, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 74
    :goto_1
    invoke-virtual {v3, v4}, Le/h/b/a/m/d;->c(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final b(Le/h/b/a/m/d;Le/h/b/a/m/d;)Z
    .locals 2

    .line 75
    invoke-virtual {p2}, Le/h/b/a/m/d;->q()Le/h/b/a/m/a;

    move-result-object v0

    sget-object v1, Le/h/b/a/m/a;->b:Le/h/b/a/m/a;

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Le/h/b/a/m/d;->q()Le/h/b/a/m/a;

    move-result-object v0

    sget-object v1, Le/h/b/a/m/a;->c:Le/h/b/a/m/a;

    if-ne v0, v1, :cond_1

    .line 76
    :cond_0
    invoke-virtual {p1}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 77
    invoke-virtual {p1}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v0

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v1

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p2}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object p2

    if-ne p1, p2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(Z)Z
    .locals 12

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 50
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 51
    new-instance v2, Lcom/orange/business/packid/android/lib/PackId;

    iget-object v3, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;

    move-result-object v2

    .line 52
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const-string v4, "packid.badgeAdapter"

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v3, v5, :cond_0

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/User;->isDefault()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 53
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 54
    new-instance v3, Le/h/b/a/m/d;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v5

    invoke-virtual {v5}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    iget-object v7, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    invoke-direct {v3, v5, v2, v7}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/content/Context;)V

    .line 55
    new-instance v5, Le/h/b/a/m/d;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v7

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-direct {v5, v7, v2, v6}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;Lfr/mbs/binary/Octets;Z)V

    .line 56
    invoke-virtual {p0, v3, v5}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Le/h/b/a/m/d;)V

    .line 57
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "##### custome default badge"

    .line 59
    invoke-static {v4, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_2

    .line 60
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 61
    new-instance v8, Le/h/b/a/m/d;

    invoke-virtual {v7}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v9

    invoke-virtual {v7}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v10

    invoke-direct {v8, v9, v10, v6}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;Lfr/mbs/binary/Octets;Z)V

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "User tenant is "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    invoke-virtual {v7}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v8

    invoke-virtual {v8}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v8

    .line 64
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_2

    .line 65
    new-instance v8, Le/h/b/a/m/d;

    invoke-virtual {v7}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v9

    invoke-virtual {v7}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v7

    invoke-direct {v8, v9, v7, v5}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;Lfr/mbs/binary/Octets;Z)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 66
    :cond_2
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 67
    invoke-virtual {v9}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getStatus()Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    move-result-object v10

    sget-object v11, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLING:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    if-ne v10, v11, :cond_3

    const/4 v3, 0x1

    .line 68
    :cond_3
    new-instance v10, Le/h/b/a/m/d;

    iget-object v11, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    invoke-direct {v10, v9, v7, v11}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/content/Context;)V

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    move v6, v3

    .line 69
    :goto_2
    invoke-virtual {p0, v1, v0, p1}, Le/h/b/a/l/y0;->a(Ljava/util/List;Ljava/util/List;Z)V

    return v6
.end method

.method public c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)I
    .locals 1

    .line 7
    invoke-virtual {p0, p1, p2}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/m/d;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Badge "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le/h/b/a/m/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " unlocked"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "packid.badgeAdapter"

    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p2, 0x0

    .line 9
    invoke-virtual {p1, p2}, Le/h/b/a/m/d;->d(Z)V

    .line 10
    :cond_0
    iget-object p2, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final c(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;
    .locals 3

    .line 6
    iget-object v0, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1
.end method

.method public final c(Le/h/b/a/m/d;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Le/h/b/a/m/d;->u()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final c(Le/h/b/a/m/e;Le/h/b/a/m/d;)V
    .locals 2

    .line 2
    invoke-virtual {p1}, Le/h/b/a/m/e;->I()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object p1

    .line 3
    invoke-virtual {p0, p2}, Le/h/b/a/l/y0;->c(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;

    move-result-object p2

    const-string v0, "isFavorite"

    const/4 v1, 0x0

    .line 4
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setActive(Ljava/lang/Boolean;)V

    .line 5
    new-instance v0, Le/h/b/a/l/r;

    invoke-direct {v0, p0, p2}, Le/h/b/a/l/r;-><init>(Le/h/b/a/l/y0;Landroid/content/SharedPreferences;)V

    invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public d(I)Le/h/b/a/m/d;
    .locals 1

    .line 6
    iget-object v0, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/h/b/a/m/d;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final d()V
    .locals 2

    .line 5
    iget-object v0, p0, Le/h/b/a/l/y0;->i:Landroid/os/Handler;

    new-instance v1, Le/h/b/a/l/a;

    invoke-direct {v1, p0}, Le/h/b/a/l/a;-><init>(Le/h/b/a/l/y0;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final d(Le/h/b/a/m/e;Le/h/b/a/m/d;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Le/h/b/a/m/e;->P()Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->getBluetoothState(Landroid/content/Context;)I

    move-result v0

    const/16 v1, 0xc

    if-ne v1, v0, :cond_0

    .line 3
    invoke-virtual {p1}, Le/h/b/a/m/e;->P()Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;

    move-result-object p1

    invoke-virtual {p2}, Le/h/b/a/m/d;->k()Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/orange/hce/proto/activity/NetworkQualityIndicatorView;->setRssiLevel(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Le/h/b/a/m/e;->S()V

    :goto_0
    return-void
.end method

.method public e()V
    .locals 5

    .line 9
    iget-object v0, p0, Le/h/b/a/l/y0;->d:Ljava/util/List;

    invoke-static {}, Le/h/b/a/p/h;->a()Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 10
    iget-object v0, p0, Le/h/b/a/l/y0;->e:Ljava/util/List;

    iget-object v1, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    invoke-static {v1}, Le/h/b/a/p/h;->a(Landroid/content/Context;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    iget-object v1, p0, Le/h/b/a/l/y0;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/h/b/a/m/d;

    .line 13
    invoke-virtual {p0, v2}, Le/h/b/a/l/y0;->b(Le/h/b/a/m/d;)Ljava/util/List;

    move-result-object v3

    .line 14
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    .line 15
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 17
    :cond_1
    iput-object v0, p0, Le/h/b/a/l/y0;->f:Ljava/util/List;

    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->c()V

    .line 19
    iget-object v0, p0, Le/h/b/a/l/y0;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->c(Landroid/content/Context;)V

    return-void
.end method

.method public final e(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 1

    .line 1
    check-cast p1, Le/h/b/a/m/g;

    .line 2
    invoke-virtual {p1}, Le/h/b/a/m/g;->C()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f0e00dc

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final e(Le/h/b/a/m/e;Le/h/b/a/m/d;)V
    .locals 3

    .line 3
    invoke-virtual {p1}, Le/h/b/a/m/e;->O()Lcom/orange/hce/proto/activity/StateImageButton;

    move-result-object p1

    .line 4
    invoke-virtual {p2}, Le/h/b/a/m/d;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 5
    invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setActivated(Z)V

    .line 6
    invoke-virtual {p1}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {p2}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->isAutorised(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setActive(Ljava/lang/Boolean;)V

    .line 7
    new-instance v0, Le/h/b/a/l/s;

    invoke-direct {v0, p0, p2}, Le/h/b/a/l/s;-><init>(Le/h/b/a/l/y0;Le/h/b/a/m/d;)V

    invoke-virtual {p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 8
    invoke-virtual {p1, p2}, Lcom/orange/hce/proto/activity/StateImageButton;->setActivated(Z)V

    :goto_0
    return-void
.end method
