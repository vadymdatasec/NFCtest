.class public final synthetic Le/f/a/b/b/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/a;


# static fields
.field public static final a:Le/f/a/b/h/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/a/b/b/y;

    invoke-direct {v0}, Le/f/a/b/b/y;-><init>()V

    sput-object v0, Le/f/a/b/b/y;->a:Le/f/a/b/h/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Le/f/a/b/b/e;->a(Le/f/a/b/h/g;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method
