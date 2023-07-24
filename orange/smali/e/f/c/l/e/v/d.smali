.class public Le/f/c/l/e/v/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/b/h/f<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le/f/c/l/e/v/e;


# direct methods
.method public constructor <init>(Le/f/c/l/e/v/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/v/d;->a:Le/f/c/l/e/v/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Le/f/a/b/h/g;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Le/f/c/l/e/v/d;->a(Ljava/lang/Void;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Void;)Le/f/a/b/h/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Void;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-object p1, p0, Le/f/c/l/e/v/d;->a:Le/f/c/l/e/v/e;

    .line 3
    invoke-static {p1}, Le/f/c/l/e/v/e;->b(Le/f/c/l/e/v/e;)Le/f/c/l/e/v/k/d;

    move-result-object p1

    iget-object v0, p0, Le/f/c/l/e/v/d;->a:Le/f/c/l/e/v/e;

    invoke-static {v0}, Le/f/c/l/e/v/e;->a(Le/f/c/l/e/v/e;)Le/f/c/l/e/v/j/g;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Le/f/c/l/e/v/k/d;->a(Le/f/c/l/e/v/j/g;Z)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object v0, p0, Le/f/c/l/e/v/d;->a:Le/f/c/l/e/v/e;

    .line 5
    invoke-static {v0}, Le/f/c/l/e/v/e;->c(Le/f/c/l/e/v/e;)Le/f/c/l/e/v/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/f/c/l/e/v/g;->a(Lorg/json/JSONObject;)Le/f/c/l/e/v/j/f;

    move-result-object v0

    .line 6
    iget-object v1, p0, Le/f/c/l/e/v/d;->a:Le/f/c/l/e/v/e;

    invoke-static {v1}, Le/f/c/l/e/v/e;->d(Le/f/c/l/e/v/e;)Le/f/c/l/e/v/a;

    move-result-object v1

    .line 7
    invoke-virtual {v0}, Le/f/c/l/e/v/j/f;->d()J

    move-result-wide v2

    .line 8
    invoke-virtual {v1, v2, v3, p1}, Le/f/c/l/e/v/a;->a(JLorg/json/JSONObject;)V

    .line 9
    iget-object v1, p0, Le/f/c/l/e/v/d;->a:Le/f/c/l/e/v/e;

    const-string v2, "Loaded settings: "

    invoke-static {v1, p1, v2}, Le/f/c/l/e/v/e;->a(Le/f/c/l/e/v/e;Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Le/f/c/l/e/v/d;->a:Le/f/c/l/e/v/e;

    invoke-static {p1}, Le/f/c/l/e/v/e;->a(Le/f/c/l/e/v/e;)Le/f/c/l/e/v/j/g;

    move-result-object v1

    iget-object v1, v1, Le/f/c/l/e/v/j/g;->f:Ljava/lang/String;

    invoke-static {p1, v1}, Le/f/c/l/e/v/e;->a(Le/f/c/l/e/v/e;Ljava/lang/String;)Z

    .line 11
    iget-object p1, p0, Le/f/c/l/e/v/d;->a:Le/f/c/l/e/v/e;

    invoke-static {p1}, Le/f/c/l/e/v/e;->e(Le/f/c/l/e/v/e;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 12
    iget-object p1, p0, Le/f/c/l/e/v/d;->a:Le/f/c/l/e/v/e;

    invoke-static {p1}, Le/f/c/l/e/v/e;->f(Le/f/c/l/e/v/e;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/a/b/h/h;

    invoke-virtual {v0}, Le/f/c/l/e/v/j/f;->c()Le/f/c/l/e/v/j/b;

    move-result-object v1

    invoke-virtual {p1, v1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    .line 13
    new-instance p1, Le/f/a/b/h/h;

    invoke-direct {p1}, Le/f/a/b/h/h;-><init>()V

    .line 14
    invoke-virtual {v0}, Le/f/c/l/e/v/j/f;->c()Le/f/c/l/e/v/j/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    .line 15
    iget-object v0, p0, Le/f/c/l/e/v/d;->a:Le/f/c/l/e/v/e;

    invoke-static {v0}, Le/f/c/l/e/v/e;->f(Le/f/c/l/e/v/e;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_0
    const/4 p1, 0x0

    .line 16
    invoke-static {p1}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method
