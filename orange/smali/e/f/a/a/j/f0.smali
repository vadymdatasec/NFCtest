.class public final Le/f/a/a/j/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf/a/b<",
        "Le/f/a/a/j/c0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/l0/a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/l0/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/j0/e;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/s;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/w;",
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
            "Le/f/a/a/j/l0/a;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/l0/a;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/e;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/s;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/w;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/a/j/f0;->a:Lh/a/a;

    .line 3
    iput-object p2, p0, Le/f/a/a/j/f0;->b:Lh/a/a;

    .line 4
    iput-object p3, p0, Le/f/a/a/j/f0;->c:Lh/a/a;

    .line 5
    iput-object p4, p0, Le/f/a/a/j/f0;->d:Lh/a/a;

    .line 6
    iput-object p5, p0, Le/f/a/a/j/f0;->e:Lh/a/a;

    return-void
.end method

.method public static a(Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;)Le/f/a/a/j/f0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/a/a<",
            "Le/f/a/a/j/l0/a;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/l0/a;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/e;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/s;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/w;",
            ">;)",
            "Le/f/a/a/j/f0;"
        }
    .end annotation

    .line 1
    new-instance v6, Le/f/a/a/j/f0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Le/f/a/a/j/f0;-><init>(Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;)V

    return-object v6
.end method


# virtual methods
.method public get()Le/f/a/a/j/c0;
    .locals 7

    .line 2
    new-instance v6, Le/f/a/a/j/c0;

    iget-object v0, p0, Le/f/a/a/j/f0;->a:Lh/a/a;

    invoke-interface {v0}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Le/f/a/a/j/l0/a;

    iget-object v0, p0, Le/f/a/a/j/f0;->b:Lh/a/a;

    invoke-interface {v0}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Le/f/a/a/j/l0/a;

    iget-object v0, p0, Le/f/a/a/j/f0;->c:Lh/a/a;

    invoke-interface {v0}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Le/f/a/a/j/j0/e;

    iget-object v0, p0, Le/f/a/a/j/f0;->d:Lh/a/a;

    invoke-interface {v0}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Le/f/a/a/j/j0/j/s;

    iget-object v0, p0, Le/f/a/a/j/f0;->e:Lh/a/a;

    invoke-interface {v0}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le/f/a/a/j/j0/j/w;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Le/f/a/a/j/c0;-><init>(Le/f/a/a/j/l0/a;Le/f/a/a/j/l0/a;Le/f/a/a/j/j0/e;Le/f/a/a/j/j0/j/s;Le/f/a/a/j/j0/j/w;)V

    return-object v6
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/f0;->get()Le/f/a/a/j/c0;

    move-result-object v0

    return-object v0
.end method
