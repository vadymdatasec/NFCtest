.class public final synthetic Le/f/a/a/j/j0/k/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/j0/k/f0;


# static fields
.field public static final a:Le/f/a/a/j/j0/k/r;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/k/r;

    invoke-direct {v0}, Le/f/a/a/j/j0/k/r;-><init>()V

    sput-object v0, Le/f/a/a/j/j0/k/r;->a:Le/f/a/a/j/j0/k/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/f/a/a/j/j0/k/f0;
    .locals 1

    sget-object v0, Le/f/a/a/j/j0/k/r;->a:Le/f/a/a/j/j0/k/r;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/database/Cursor;

    invoke-static {p1}, Le/f/a/a/j/j0/k/i0;->d(Landroid/database/Cursor;)[B

    move-result-object p1

    return-object p1
.end method
