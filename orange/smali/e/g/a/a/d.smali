.class public final Le/g/a/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/g/a/a/b$a;

.field public c:Le/g/a/a/b$b;

.field public d:Ljava/lang/Exception;

.field public final synthetic e:Le/g/a/a/b$c;


# direct methods
.method public constructor <init>(Le/g/a/a/b$c;Le/g/a/a/b$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/g/a/a/d;->e:Le/g/a/a/b$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Le/g/a/a/d;->b:Le/g/a/a/b$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Le/g/a/a/d;->e:Le/g/a/a/b$c;

    iget-object v0, v0, Le/g/a/a/b$c;->a:Landroid/content/Context;

    iget-object v1, p0, Le/g/a/a/d;->e:Le/g/a/a/b$c;

    iget-object v1, v1, Le/g/a/a/b$c;->c:Ljava/lang/String;

    iget-object v2, p0, Le/g/a/a/d;->e:Le/g/a/a/b$c;

    iget-object v2, v2, Le/g/a/a/b$c;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Le/g/a/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Le/g/a/a/b$b;

    move-result-object v0

    iput-object v0, p0, Le/g/a/a/d;->c:Le/g/a/a/b$b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    iput-object v0, p0, Le/g/a/a/d;->d:Ljava/lang/Exception;

    .line 3
    :goto_0
    iget-object v0, p0, Le/g/a/a/d;->e:Le/g/a/a/b$c;

    iget-object v0, v0, Le/g/a/a/b$c;->b:Landroid/os/Handler;

    new-instance v1, Le/g/a/a/c;

    invoke-direct {v1, p0}, Le/g/a/a/c;-><init>(Le/g/a/a/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
