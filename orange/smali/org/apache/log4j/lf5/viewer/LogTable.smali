.class public Lorg/apache/log4j/lf5/viewer/LogTable;
.super Ljavax/swing/JTable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/log4j/lf5/viewer/LogTable$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:[Ljavax/swing/table/TableColumn;

.field public d:[I

.field public e:[Lorg/apache/log4j/lf5/viewer/LogTableColumn;

.field public f:Lorg/apache/log4j/lf5/util/DateFormatManager;


# direct methods
.method public constructor <init>(Ljavax/swing/JTextArea;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljavax/swing/JTable;-><init>()V

    const/16 p1, 0x1e

    .line 2
    iput p1, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->a:I

    const/16 p1, 0x9

    .line 3
    iput p1, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->b:I

    new-array v0, p1, [Ljavax/swing/table/TableColumn;

    .line 4
    iput-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->c:[Ljavax/swing/table/TableColumn;

    new-array p1, p1, [I

    .line 5
    fill-array-data p1, :array_0

    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->d:[I

    .line 6
    invoke-static {}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->getLogTableColumnArray()[Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->e:[Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->f:Lorg/apache/log4j/lf5/util/DateFormatManager;

    .line 8
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->b()V

    .line 9
    new-instance p1, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;

    invoke-direct {p1}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;-><init>()V

    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogTable;->setModel(Ljavax/swing/table/TableModel;)V

    .line 10
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getColumnModel()Ljavax/swing/table/TableColumnModel;

    move-result-object p1

    invoke-interface {p1}, Ljavax/swing/table/TableColumnModel;->getColumns()Ljava/util/Enumeration;

    move-result-object p1

    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 12
    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljavax/swing/table/TableColumn;

    .line 13
    new-instance v2, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;

    invoke-direct {v2}, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;-><init>()V

    invoke-virtual {v1, v2}, Ljavax/swing/table/TableColumn;->setCellRenderer(Ljavax/swing/table/TableCellRenderer;)V

    .line 14
    iget-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->d:[I

    aget v2, v2, v0

    invoke-virtual {v1, v2}, Ljavax/swing/table/TableColumn;->setPreferredWidth(I)V

    .line 15
    iget-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->c:[Ljavax/swing/table/TableColumn;

    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getSelectionModel()Ljavax/swing/ListSelectionModel;

    move-result-object p1

    .line 17
    new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTable$a;

    invoke-direct {v0, p0, p0}, Lorg/apache/log4j/lf5/viewer/LogTable$a;-><init>(Lorg/apache/log4j/lf5/viewer/LogTable;Ljavax/swing/JTable;)V

    invoke-interface {p1, v0}, Ljavax/swing/ListSelectionModel;->addListSelectionListener(Ljavax/swing/event/ListSelectionListener;)V

    return-void

    :array_0
    .array-data 4
        0x28
        0x28
        0x28
        0x46
        0x46
        0x168
        0x1b8
        0xc8
        0x3c
    .end array-data
.end method


# virtual methods
.method public a()Ljava/util/Vector;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    const/4 v1, 0x0

    .line 2
    :goto_0
    iget-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->e:[Lorg/apache/log4j/lf5/viewer/LogTableColumn;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 3
    aget-object v2, v2, v1

    invoke-virtual {v0, v1, v2}, Ljava/util/Vector;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public b()V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->a:I

    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->setRowHeight(I)V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->setSelectionMode(I)V

    return-void
.end method

.method public declared-synchronized clearLogRecords()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;

    move-result-object v0

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getDateFormatManager()Lorg/apache/log4j/lf5/util/DateFormatManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->f:Lorg/apache/log4j/lf5/util/DateFormatManager;

    return-object v0
.end method

.method public getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getModel()Ljavax/swing/table/TableModel;

    move-result-object v0

    check-cast v0, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;

    return-object v0
.end method

.method public setDateFormatManager(Lorg/apache/log4j/lf5/util/DateFormatManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->f:Lorg/apache/log4j/lf5/util/DateFormatManager;

    return-void
.end method

.method public setDetailedView()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getColumnModel()Ljavax/swing/table/TableColumnModel;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2
    :goto_0
    iget v3, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->b:I

    if-ge v2, v3, :cond_0

    .line 3
    iget-object v3, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->c:[Ljavax/swing/table/TableColumn;

    aget-object v3, v3, v2

    invoke-interface {v0, v3}, Ljavax/swing/table/TableColumnModel;->removeColumn(Ljavax/swing/table/TableColumn;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_0
    :goto_1
    iget v2, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->b:I

    if-ge v1, v2, :cond_1

    .line 5
    iget-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->c:[Ljavax/swing/table/TableColumn;

    aget-object v2, v2, v1

    invoke-interface {v0, v2}, Ljavax/swing/table/TableColumnModel;->addColumn(Ljavax/swing/table/TableColumn;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, -0x1

    .line 6
    invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->sizeColumnsToFit(I)V

    return-void
.end method

.method public setFont(Ljava/awt/Font;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Ljavax/swing/JTable;->setFont(Ljava/awt/Font;)V

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getGraphics()Ljava/awt/Graphics;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Ljava/awt/Graphics;->getFontMetrics(Ljava/awt/Font;)Ljava/awt/FontMetrics;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Ljava/awt/FontMetrics;->getHeight()I

    move-result p1

    .line 5
    div-int/lit8 v0, p1, 0x3

    add-int/2addr p1, v0

    iput p1, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->a:I

    .line 6
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogTable;->setRowHeight(I)V

    :cond_0
    return-void
.end method

.method public setView(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getColumnModel()Ljavax/swing/table/TableColumnModel;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    :goto_0
    iget v2, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->b:I

    if-ge v1, v2, :cond_0

    .line 3
    iget-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->c:[Ljavax/swing/table/TableColumn;

    aget-object v2, v2, v1

    invoke-interface {v0, v2}, Ljavax/swing/table/TableColumnModel;->removeColumn(Ljavax/swing/table/TableColumn;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->a()Ljava/util/Vector;

    move-result-object v1

    .line 6
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 7
    iget-object v2, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->c:[Ljavax/swing/table/TableColumn;

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/Vector;->indexOf(Ljava/lang/Object;)I

    move-result v3

    aget-object v2, v2, v3

    invoke-interface {v0, v2}, Ljavax/swing/table/TableColumnModel;->addColumn(Ljavax/swing/table/TableColumn;)V

    goto :goto_1

    :cond_1
    const/4 p1, -0x1

    .line 8
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogTable;->sizeColumnsToFit(I)V

    return-void
.end method
