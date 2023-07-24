.class public Lc/l/d/s$e;
.super Lc/l/d/n0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/l/d/s;->a()Lc/l/d/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lc/l/d/n0;

.field public final synthetic b:Lc/l/d/s;


# direct methods
.method public constructor <init>(Lc/l/d/s;Lc/l/d/n0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/s$e;->b:Lc/l/d/s;

    iput-object p2, p0, Lc/l/d/s$e;->a:Lc/l/d/n0;

    invoke-direct {p0}, Lc/l/d/n0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/s$e;->a:Lc/l/d/n0;

    invoke-virtual {v0}, Lc/l/d/n0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/l/d/s$e;->a:Lc/l/d/n0;

    invoke-virtual {v0, p1}, Lc/l/d/n0;->a(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Lc/l/d/s$e;->b:Lc/l/d/s;

    invoke-virtual {v0, p1}, Lc/l/d/s;->b(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public a()Z
    .locals 1

    .line 4
    iget-object v0, p0, Lc/l/d/s$e;->a:Lc/l/d/n0;

    invoke-virtual {v0}, Lc/l/d/n0;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/l/d/s$e;->b:Lc/l/d/s;

    invoke-virtual {v0}, Lc/l/d/s;->A0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
