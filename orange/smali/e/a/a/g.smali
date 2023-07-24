.class public Le/a/a/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/a/a/p;

.field public final c:Le/a/a/v;

.field public final d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Le/a/a/p;Le/a/a/v;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/a/a/g;->b:Le/a/a/p;

    .line 3
    iput-object p2, p0, Le/a/a/g;->c:Le/a/a/v;

    .line 4
    iput-object p3, p0, Le/a/a/g;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/a/a/g;->b:Le/a/a/p;

    invoke-virtual {v0}, Le/a/a/p;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/a/a/g;->b:Le/a/a/p;

    const-string v1, "canceled-at-delivery"

    invoke-virtual {v0, v1}, Le/a/a/p;->b(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Le/a/a/g;->c:Le/a/a/v;

    invoke-virtual {v0}, Le/a/a/v;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Le/a/a/g;->b:Le/a/a/p;

    iget-object v1, p0, Le/a/a/g;->c:Le/a/a/v;

    iget-object v1, v1, Le/a/a/v;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Le/a/a/p;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Le/a/a/g;->b:Le/a/a/p;

    iget-object v1, p0, Le/a/a/g;->c:Le/a/a/v;

    iget-object v1, v1, Le/a/a/v;->c:Lcom/android/volley/VolleyError;

    invoke-virtual {v0, v1}, Le/a/a/p;->a(Lcom/android/volley/VolleyError;)V

    .line 6
    :goto_0
    iget-object v0, p0, Le/a/a/g;->c:Le/a/a/v;

    iget-boolean v0, v0, Le/a/a/v;->d:Z

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Le/a/a/g;->b:Le/a/a/p;

    const-string v1, "intermediate-response"

    invoke-virtual {v0, v1}, Le/a/a/p;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 8
    :cond_2
    iget-object v0, p0, Le/a/a/g;->b:Le/a/a/p;

    const-string v1, "done"

    invoke-virtual {v0, v1}, Le/a/a/p;->b(Ljava/lang/String;)V

    .line 9
    :goto_1
    iget-object v0, p0, Le/a/a/g;->d:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    .line 10
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_3
    return-void
.end method
