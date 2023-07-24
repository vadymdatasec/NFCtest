.class public interface abstract Le/b/a/y/x/h1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le/b/a/y/x/h1/j;

.field public static final b:Le/b/a/y/x/h1/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/y/x/h1/g;

    invoke-direct {v0}, Le/b/a/y/x/h1/g;-><init>()V

    .line 2
    new-instance v0, Le/b/a/y/x/h1/h;

    invoke-direct {v0}, Le/b/a/y/x/h1/h;-><init>()V

    sput-object v0, Le/b/a/y/x/h1/j;->a:Le/b/a/y/x/h1/j;

    .line 3
    new-instance v0, Le/b/a/y/x/h1/i;

    invoke-direct {v0}, Le/b/a/y/x/h1/i;-><init>()V

    .line 4
    sget-object v0, Le/b/a/y/x/h1/j;->a:Le/b/a/y/x/h1/j;

    sput-object v0, Le/b/a/y/x/h1/j;->b:Le/b/a/y/x/h1/j;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Throwable;)V
.end method
