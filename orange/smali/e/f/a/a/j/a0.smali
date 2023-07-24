.class public final Le/f/a/a/j/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/f/a/a/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/a/j/x;

.field public final b:Ljava/lang/String;

.field public final c:Le/f/a/a/b;

.field public final d:Le/f/a/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/a/e<",
            "TT;[B>;"
        }
    .end annotation
.end field

.field public final e:Le/f/a/a/j/b0;


# direct methods
.method public constructor <init>(Le/f/a/a/j/x;Ljava/lang/String;Le/f/a/a/b;Le/f/a/a/e;Le/f/a/a/j/b0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/a/j/x;",
            "Ljava/lang/String;",
            "Le/f/a/a/b;",
            "Le/f/a/a/e<",
            "TT;[B>;",
            "Le/f/a/a/j/b0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/a/j/a0;->a:Le/f/a/a/j/x;

    .line 3
    iput-object p2, p0, Le/f/a/a/j/a0;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Le/f/a/a/j/a0;->c:Le/f/a/a/b;

    .line 5
    iput-object p4, p0, Le/f/a/a/j/a0;->d:Le/f/a/a/e;

    .line 6
    iput-object p5, p0, Le/f/a/a/j/a0;->e:Le/f/a/a/j/b0;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Le/f/a/a/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/a/c<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Le/f/a/a/j/z;->a()Le/f/a/a/h;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le/f/a/a/j/a0;->a(Le/f/a/a/c;Le/f/a/a/h;)V

    return-void
.end method

.method public a(Le/f/a/a/c;Le/f/a/a/h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/a/c<",
            "TT;>;",
            "Le/f/a/a/h;",
            ")V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/a/a/j/a0;->e:Le/f/a/a/j/b0;

    .line 3
    invoke-static {}, Le/f/a/a/j/w;->g()Le/f/a/a/j/v;

    move-result-object v1

    iget-object v2, p0, Le/f/a/a/j/a0;->a:Le/f/a/a/j/x;

    .line 4
    invoke-virtual {v1, v2}, Le/f/a/a/j/v;->a(Le/f/a/a/j/x;)Le/f/a/a/j/v;

    .line 5
    invoke-virtual {v1, p1}, Le/f/a/a/j/v;->a(Le/f/a/a/c;)Le/f/a/a/j/v;

    iget-object p1, p0, Le/f/a/a/j/a0;->b:Ljava/lang/String;

    .line 6
    invoke-virtual {v1, p1}, Le/f/a/a/j/v;->a(Ljava/lang/String;)Le/f/a/a/j/v;

    iget-object p1, p0, Le/f/a/a/j/a0;->d:Le/f/a/a/e;

    .line 7
    invoke-virtual {v1, p1}, Le/f/a/a/j/v;->a(Le/f/a/a/e;)Le/f/a/a/j/v;

    iget-object p1, p0, Le/f/a/a/j/a0;->c:Le/f/a/a/b;

    .line 8
    invoke-virtual {v1, p1}, Le/f/a/a/j/v;->a(Le/f/a/a/b;)Le/f/a/a/j/v;

    .line 9
    invoke-virtual {v1}, Le/f/a/a/j/v;->a()Le/f/a/a/j/w;

    move-result-object p1

    .line 10
    invoke-interface {v0, p1, p2}, Le/f/a/a/j/b0;->a(Le/f/a/a/j/w;Le/f/a/a/h;)V

    return-void
.end method
