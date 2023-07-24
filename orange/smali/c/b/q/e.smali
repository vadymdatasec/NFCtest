.class public Lc/b/q/e;
.super Landroidx/appcompat/view/menu/ActionMenuItemView$b;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/b/q/k;


# direct methods
.method public constructor <init>(Lc/b/q/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/e;->a:Lc/b/q/k;

    invoke-direct {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lc/b/p/o/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/e;->a:Lc/b/q/k;

    iget-object v0, v0, Lc/b/q/k;->y:Lc/b/q/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/b/p/o/y;->c()Lc/b/p/o/w;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
