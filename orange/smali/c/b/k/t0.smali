.class public Lc/b/k/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/Toolbar$f;


# instance fields
.field public final synthetic a:Lc/b/k/x0;


# direct methods
.method public constructor <init>(Lc/b/k/x0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/t0;->a:Lc/b/k/x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/k/t0;->a:Lc/b/k/x0;

    iget-object v0, v0, Lc/b/k/x0;->c:Landroid/view/Window$Callback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
