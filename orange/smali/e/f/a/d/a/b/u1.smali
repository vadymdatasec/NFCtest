.class public final Le/f/a/d/a/b/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/e/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/d/a/e/a0<",
        "Le/f/a/d/a/b/t1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/v;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/x0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/f2;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/e/a0<",
            "Ljava/lang/String;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/v;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/x0;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Landroid/content/Context;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/f2;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Ljava/util/concurrent/Executor;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/u1;->a:Le/f/a/d/a/e/a0;

    iput-object p2, p0, Le/f/a/d/a/b/u1;->b:Le/f/a/d/a/e/a0;

    iput-object p3, p0, Le/f/a/d/a/b/u1;->c:Le/f/a/d/a/e/a0;

    iput-object p4, p0, Le/f/a/d/a/b/u1;->d:Le/f/a/d/a/e/a0;

    iput-object p5, p0, Le/f/a/d/a/b/u1;->e:Le/f/a/d/a/e/a0;

    iput-object p6, p0, Le/f/a/d/a/b/u1;->f:Le/f/a/d/a/e/a0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Le/f/a/d/a/b/u1;->a:Le/f/a/d/a/e/a0;

    invoke-interface {v0}, Le/f/a/d/a/e/a0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Le/f/a/d/a/b/u1;->b:Le/f/a/d/a/e/a0;

    invoke-interface {v1}, Le/f/a/d/a/e/a0;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Le/f/a/d/a/b/u1;->c:Le/f/a/d/a/e/a0;

    invoke-interface {v2}, Le/f/a/d/a/e/a0;->a()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Le/f/a/d/a/b/u1;->d:Le/f/a/d/a/e/a0;

    check-cast v3, Le/f/a/d/a/b/f3;

    invoke-virtual {v3}, Le/f/a/d/a/b/f3;->b()Landroid/content/Context;

    move-result-object v8

    iget-object v3, p0, Le/f/a/d/a/b/u1;->e:Le/f/a/d/a/e/a0;

    invoke-interface {v3}, Le/f/a/d/a/e/a0;->a()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Le/f/a/d/a/b/u1;->f:Le/f/a/d/a/e/a0;

    invoke-static {v4}, Le/f/a/d/a/e/z;->b(Le/f/a/d/a/e/a0;)Le/f/a/d/a/e/x;

    move-result-object v10

    new-instance v11, Le/f/a/d/a/b/t1;

    move-object v6, v1

    check-cast v6, Le/f/a/d/a/b/v;

    move-object v7, v2

    check-cast v7, Le/f/a/d/a/b/x0;

    move-object v9, v3

    check-cast v9, Le/f/a/d/a/b/f2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Ljava/io/File;

    invoke-virtual {v8, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v5, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v8, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    move-object v5, v0

    :goto_0
    move-object v4, v11

    invoke-direct/range {v4 .. v10}, Le/f/a/d/a/b/t1;-><init>(Ljava/io/File;Le/f/a/d/a/b/v;Le/f/a/d/a/b/x0;Landroid/content/Context;Le/f/a/d/a/b/f2;Le/f/a/d/a/e/x;)V

    return-object v11
.end method
