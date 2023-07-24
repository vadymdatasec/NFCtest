.class public Lc/l/d/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lc/l/d/h3;

.field public final synthetic d:Lc/l/d/r;


# direct methods
.method public constructor <init>(Lc/l/d/r;Ljava/util/List;Lc/l/d/h3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/e;->d:Lc/l/d/r;

    iput-object p2, p0, Lc/l/d/e;->b:Ljava/util/List;

    iput-object p3, p0, Lc/l/d/e;->c:Lc/l/d/h3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/e;->b:Ljava/util/List;

    iget-object v1, p0, Lc/l/d/e;->c:Lc/l/d/h3;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/l/d/e;->b:Ljava/util/List;

    iget-object v1, p0, Lc/l/d/e;->c:Lc/l/d/h3;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Lc/l/d/e;->d:Lc/l/d/r;

    iget-object v1, p0, Lc/l/d/e;->c:Lc/l/d/h3;

    invoke-virtual {v0, v1}, Lc/l/d/r;->a(Lc/l/d/h3;)V

    :cond_0
    return-void
.end method
