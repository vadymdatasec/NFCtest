.class public Lc/r/d/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static d:Lc/h/m/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/h/m/d<",
            "Lc/r/d/r0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:Landroidx/recyclerview/widget/RecyclerView$l$b;

.field public c:Landroidx/recyclerview/widget/RecyclerView$l$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc/h/m/e;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lc/h/m/e;-><init>(I)V

    sput-object v0, Lc/r/d/r0;->d:Lc/h/m/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 1

    .line 5
    :goto_0
    sget-object v0, Lc/r/d/r0;->d:Lc/h/m/d;

    invoke-interface {v0}, Lc/h/m/d;->a()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static a(Lc/r/d/r0;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lc/r/d/r0;->a:I

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc/r/d/r0;->b:Landroidx/recyclerview/widget/RecyclerView$l$b;

    .line 3
    iput-object v0, p0, Lc/r/d/r0;->c:Landroidx/recyclerview/widget/RecyclerView$l$b;

    .line 4
    sget-object v0, Lc/r/d/r0;->d:Lc/h/m/d;

    invoke-interface {v0, p0}, Lc/h/m/d;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public static b()Lc/r/d/r0;
    .locals 1

    .line 1
    sget-object v0, Lc/r/d/r0;->d:Lc/h/m/d;

    invoke-interface {v0}, Lc/h/m/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/r/d/r0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lc/r/d/r0;

    invoke-direct {v0}, Lc/r/d/r0;-><init>()V

    :cond_0
    return-object v0
.end method
