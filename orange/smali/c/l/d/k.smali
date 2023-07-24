.class public Lc/l/d/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/l/d/h3;

.field public final synthetic c:Lc/l/d/h3;

.field public final synthetic d:Z

.field public final synthetic e:Lc/e/b;


# direct methods
.method public constructor <init>(Lc/l/d/r;Lc/l/d/h3;Lc/l/d/h3;ZLc/e/b;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/l/d/k;->b:Lc/l/d/h3;

    iput-object p3, p0, Lc/l/d/k;->c:Lc/l/d/h3;

    iput-boolean p4, p0, Lc/l/d/k;->d:Z

    iput-object p5, p0, Lc/l/d/k;->e:Lc/e/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/l/d/k;->b:Lc/l/d/h3;

    .line 2
    invoke-virtual {v0}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v1, p0, Lc/l/d/k;->c:Lc/l/d/h3;

    invoke-virtual {v1}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v1

    iget-boolean v2, p0, Lc/l/d/k;->d:Z

    iget-object v3, p0, Lc/l/d/k;->e:Lc/e/b;

    const/4 v4, 0x0

    .line 3
    invoke-static {v0, v1, v2, v3, v4}, Lc/l/d/n2;->a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLc/e/b;Z)V

    return-void
.end method
