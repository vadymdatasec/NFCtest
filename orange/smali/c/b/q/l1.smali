.class public Lc/b/q/l1;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/b/q/p1;


# direct methods
.method public constructor <init>(Lc/b/q/p1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/l1;->a:Lc/b/q/p1;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/l1;->a:Lc/b/q/p1;

    invoke-virtual {v0}, Lc/b/q/p1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/b/q/l1;->a:Lc/b/q/p1;

    invoke-virtual {v0}, Lc/b/q/p1;->a()V

    :cond_0
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/l1;->a:Lc/b/q/p1;

    invoke-virtual {v0}, Lc/b/q/p1;->dismiss()V

    return-void
.end method
