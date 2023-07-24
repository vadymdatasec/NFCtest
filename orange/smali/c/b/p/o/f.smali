.class public Lc/b/p/o/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/b/p/o/h;

.field public final synthetic c:Landroid/view/MenuItem;

.field public final synthetic d:Lc/b/p/o/m;

.field public final synthetic e:Lc/b/p/o/g;


# direct methods
.method public constructor <init>(Lc/b/p/o/g;Lc/b/p/o/h;Landroid/view/MenuItem;Lc/b/p/o/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/p/o/f;->e:Lc/b/p/o/g;

    iput-object p2, p0, Lc/b/p/o/f;->b:Lc/b/p/o/h;

    iput-object p3, p0, Lc/b/p/o/f;->c:Landroid/view/MenuItem;

    iput-object p4, p0, Lc/b/p/o/f;->d:Lc/b/p/o/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/b/p/o/f;->b:Lc/b/p/o/h;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lc/b/p/o/f;->e:Lc/b/p/o/g;

    iget-object v1, v1, Lc/b/p/o/g;->b:Lc/b/p/o/i;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lc/b/p/o/i;->B:Z

    .line 3
    iget-object v0, v0, Lc/b/p/o/h;->b:Lc/b/p/o/m;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc/b/p/o/m;->a(Z)V

    .line 4
    iget-object v0, p0, Lc/b/p/o/f;->e:Lc/b/p/o/g;

    iget-object v0, v0, Lc/b/p/o/g;->b:Lc/b/p/o/i;

    iput-boolean v1, v0, Lc/b/p/o/i;->B:Z

    .line 5
    :cond_0
    iget-object v0, p0, Lc/b/p/o/f;->c:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc/b/p/o/f;->c:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lc/b/p/o/f;->d:Lc/b/p/o/m;

    iget-object v1, p0, Lc/b/p/o/f;->c:Landroid/view/MenuItem;

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Lc/b/p/o/m;->a(Landroid/view/MenuItem;I)Z

    :cond_1
    return-void
.end method
