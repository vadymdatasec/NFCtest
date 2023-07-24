.class public final Le/f/a/a/j/j0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf/a/b<",
        "Le/f/a/a/j/j0/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/g0/g;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/y;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/j0/k/e;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/k0/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/a/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/g0/g;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/y;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/k/e;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/k0/b;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/a/j/j0/d;->a:Lh/a/a;

    .line 3
    iput-object p2, p0, Le/f/a/a/j/j0/d;->b:Lh/a/a;

    .line 4
    iput-object p3, p0, Le/f/a/a/j/j0/d;->c:Lh/a/a;

    .line 5
    iput-object p4, p0, Le/f/a/a/j/j0/d;->d:Lh/a/a;

    .line 6
    iput-object p5, p0, Le/f/a/a/j/j0/d;->e:Lh/a/a;

    return-void
.end method

.method public static a(Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;)Le/f/a/a/j/j0/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/a/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/g0/g;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/y;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/k/e;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/k0/b;",
            ">;)",
            "Le/f/a/a/j/j0/d;"
        }
    .end annotation

    .line 1
    new-instance v6, Le/f/a/a/j/j0/d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Le/f/a/a/j/j0/d;-><init>(Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;)V

    return-object v6
.end method


# virtual methods
.method public get()Le/f/a/a/j/j0/c;
    .locals 7

    .line 2
    new-instance v6, Le/f/a/a/j/j0/c;

    iget-object v0, p0, Le/f/a/a/j/j0/d;->a:Lh/a/a;

    invoke-interface {v0}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Le/f/a/a/j/j0/d;->b:Lh/a/a;

    invoke-interface {v0}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Le/f/a/a/j/g0/g;

    iget-object v0, p0, Le/f/a/a/j/j0/d;->c:Lh/a/a;

    invoke-interface {v0}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Le/f/a/a/j/j0/j/y;

    iget-object v0, p0, Le/f/a/a/j/j0/d;->d:Lh/a/a;

    invoke-interface {v0}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Le/f/a/a/j/j0/k/e;

    iget-object v0, p0, Le/f/a/a/j/j0/d;->e:Lh/a/a;

    invoke-interface {v0}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le/f/a/a/j/k0/b;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Le/f/a/a/j/j0/c;-><init>(Ljava/util/concurrent/Executor;Le/f/a/a/j/g0/g;Le/f/a/a/j/j0/j/y;Le/f/a/a/j/j0/k/e;Le/f/a/a/j/k0/b;)V

    return-object v6
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/j0/d;->get()Le/f/a/a/j/j0/c;

    move-result-object v0

    return-object v0
.end method
