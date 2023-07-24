.class public final Lc/b/k/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/b/p/o/z$a;


# instance fields
.field public final synthetic b:Lc/b/k/n0;


# direct methods
.method public constructor <init>(Lc/b/k/n0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/c0;->b:Lc/b/k/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/b/p/o/m;Z)V
    .locals 0

    .line 3
    iget-object p2, p0, Lc/b/k/c0;->b:Lc/b/k/n0;

    invoke-virtual {p2, p1}, Lc/b/k/n0;->b(Lc/b/p/o/m;)V

    return-void
.end method

.method public a(Lc/b/p/o/m;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/k/c0;->b:Lc/b/k/n0;

    invoke-virtual {v0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x6c

    .line 2
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
