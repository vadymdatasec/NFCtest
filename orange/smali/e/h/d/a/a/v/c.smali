.class public final Le/h/d/a/a/v/c;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic b:Le/h/d/a/a/v/d;


# direct methods
.method public constructor <init>(Le/h/d/a/a/v/d;)V
    .locals 0

    iput-object p1, p0, Le/h/d/a/a/v/c;->b:Le/h/d/a/a/v/d;

    .line 1
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Le/h/d/a/a/v/c;->b:Le/h/d/a/a/v/d;

    invoke-static {v0}, Le/h/d/a/a/v/d;->a(Le/h/d/a/a/v/d;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Posting timeout status change"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Le/h/d/a/a/v/c;->b:Le/h/d/a/a/v/d;

    invoke-virtual {v1}, Le/h/d/a/a/v/d;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Le/h/d/a/a/v/c;->b:Le/h/d/a/a/v/d;

    invoke-virtual {v1}, Le/h/d/a/a/v/d;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Le/h/d/a/a/v/c;->b:Le/h/d/a/a/v/d;

    invoke-virtual {v2}, Le/h/d/a/a/v/d;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v4}, Le/h/d/a/a/r/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 3
    iget-object v0, p0, Le/h/d/a/a/v/c;->b:Le/h/d/a/a/v/d;

    invoke-static {v0, v3}, Le/h/d/a/a/v/d;->a(Le/h/d/a/a/v/d;Z)V

    .line 4
    iget-object v0, p0, Le/h/d/a/a/v/c;->b:Le/h/d/a/a/v/d;

    invoke-virtual {v0, v3}, Le/h/d/a/a/v/d;->a(Z)V

    return-void
.end method
