.class public final synthetic Le/f/c/l/e/m/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final b:Le/f/c/l/e/m/y1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/c/l/e/m/y1;

    invoke-direct {v0}, Le/f/c/l/e/m/y1;-><init>()V

    sput-object v0, Le/f/c/l/e/m/y1;->b:Le/f/c/l/e/m/y1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/util/Comparator;
    .locals 1

    sget-object v0, Le/f/c/l/e/m/y1;->b:Le/f/c/l/e/m/y1;

    return-object v0
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Le/f/c/l/e/o/d2;

    check-cast p2, Le/f/c/l/e/o/d2;

    invoke-static {p1, p2}, Le/f/c/l/e/m/z1;->a(Le/f/c/l/e/o/d2;Le/f/c/l/e/o/d2;)I

    move-result p1

    return p1
.end method
