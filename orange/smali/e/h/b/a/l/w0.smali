.class public Le/h/b/a/l/w0;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic b:Le/h/b/a/m/d;

.field public final synthetic c:Le/h/b/a/l/y0;


# direct methods
.method public constructor <init>(Le/h/b/a/l/y0;Le/h/b/a/m/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/h/b/a/l/w0;->c:Le/h/b/a/l/y0;

    iput-object p2, p0, Le/h/b/a/l/w0;->b:Le/h/b/a/m/d;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/h/b/a/l/w0;->b:Le/h/b/a/m/d;

    sget-object v1, Le/h/b/a/m/i;->d:Le/h/b/a/m/i;

    invoke-virtual {v0, v1}, Le/h/b/a/m/d;->a(Le/h/b/a/m/i;)V

    .line 2
    iget-object v0, p0, Le/h/b/a/l/w0;->c:Le/h/b/a/l/y0;

    invoke-static {v0}, Le/h/b/a/l/y0;->a(Le/h/b/a/l/y0;)V

    return-void
.end method
